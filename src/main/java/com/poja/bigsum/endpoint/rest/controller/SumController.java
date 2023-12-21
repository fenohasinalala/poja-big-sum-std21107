package com.poja.bigsum.endpoint.rest.controller;

import com.poja.bigsum.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@PojaGenerated
@RestController
@AllArgsConstructor
public class SumController {
    @GetMapping("/big-sum")
    public String bigSum(@RequestParam(value = "a") BigInteger a,@RequestParam(value = "b") BigInteger b) {
        BigInteger sum = a.add(b);
        return String.valueOf(sum);
    }
}
