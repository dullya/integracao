package com.dullyapetronilio.integracao.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class ApiController {

    @GetMapping("/mensagem")
    public String getMensagem() {
        return  "Dados do Back-End Spring Boot";
    }

    @PostMapping("/dados")
    public String postMethodName(@RequestBody String dados){
        return "Recebido:" + dados;
    }


}
