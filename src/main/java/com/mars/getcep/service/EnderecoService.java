package com.mars.getcep.service;

import com.mars.getcep.DTO.EnderecoDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class EnderecoService {

    private final WebClient webClient;

    @Value("${correios.api.url}")
    private String apiUrl;

    public EnderecoService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(apiUrl).build();
    }

    public Mono<EnderecoDTO> getAdrressForCep(String cep){
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/{cep}/json").build(cep))
                .retrieve()
                .bodyToMono(EnderecoDTO.class);

    }
}
