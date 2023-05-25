package com.algaworks.algatransito.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste")
    public String testar() {
        return "Testando 123";
    }

}
