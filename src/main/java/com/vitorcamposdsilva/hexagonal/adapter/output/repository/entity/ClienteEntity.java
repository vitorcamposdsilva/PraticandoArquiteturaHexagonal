package com.vitorcamposdsilva.hexagonal.adapter.output.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "Clientes")
public class ClienteEntity {

    @Id
    private String id;
    private String nome;
    private EnderecoEntity endereco;
    private String cpf;
    private Boolean validaCpf;
}
