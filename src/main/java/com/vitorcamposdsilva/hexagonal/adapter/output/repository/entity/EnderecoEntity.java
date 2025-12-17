package com.vitorcamposdsilva.hexagonal.adapter.output.repository.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class EnderecoEntity {
    private String rua;
    private String cidade;
    private String estado;
}
