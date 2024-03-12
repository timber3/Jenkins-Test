package com.farmyo.test.service;

import com.farmyo.test.dto.EthResultDto;
import com.farmyo.test.dto.MyWallet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.web3j.crypto.*;

@Service
@Slf4j
public class EthServiceImpl implements EthService{
    @Override
    public EthResultDto getWallet() {

        EthResultDto ethResultDto = new EthResultDto();
        try {
            Credentials credentials = Credentials.create(Keys.createEcKeyPair());

            MyWallet wallet = new MyWallet();

            wallet.setAddr(credentials.getAddress());
            wallet.setKeyPair("0x" + credentials.getEcKeyPair().getPrivateKey().toString(16));

            ethResultDto.setStatus("200");
            ethResultDto.setMsg("성공");

            ethResultDto.setData(wallet);

            log.info("is it ok??");

            log.info("please do it!!");

        } catch (Exception e ) {
            System.out.println(e);
            ethResultDto.setStatus("404");
            ethResultDto.setMsg("실패");
            ethResultDto.setData(null);
        }

        return ethResultDto;

    }
}