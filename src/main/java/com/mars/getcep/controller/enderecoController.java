package com.mars.getcep.controller;

import com.mars.getcep.DTO.EnderecoDTO;
import com.mars.getcep.service.EnderecoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Mono;

@Controller
public class enderecoController {

    private final EnderecoService enderecoService;

    public enderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/cep/{cep}")
    public Mono<EnderecoDTO> getAdrress(@PathVariable String cep){
        return enderecoService.getAdrressForCep(cep);
    }
}
