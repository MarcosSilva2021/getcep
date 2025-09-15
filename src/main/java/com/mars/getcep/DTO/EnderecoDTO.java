package com.mars.getcep.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoDTO {

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("localidade")
    private String localidade;

    @JsonProperty("uf")
    private String uf;

    @JsonProperty("unidade")
    private String unidade;

    @JsonProperty("ibge")
    private String ibge;

    @JsonProperty("gia")
    private String gia;

}
