package com.vitorcamposdsilva.hexagonal.adapter.input.controller.respose;


import lombok.Data;

@Data
public class ClienteRespose {
    private String nome;
    private EnderecoRespose endereco;
    private String cpf;
    private Boolean validaCpf;
}
