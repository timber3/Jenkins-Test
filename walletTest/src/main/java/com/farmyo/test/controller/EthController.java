package com.farmyo.test.controller;

import com.farmyo.test.dto.EthResultDto;
import com.farmyo.test.service.EthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallet")
@RequiredArgsConstructor
public class EthController {

    private final EthService ethService;

    @GetMapping
    public ResponseEntity<EthResultDto> createWallet() {
        return new ResponseEntity<>(ethService.getWallet(), HttpStatus.OK);
    }
}
