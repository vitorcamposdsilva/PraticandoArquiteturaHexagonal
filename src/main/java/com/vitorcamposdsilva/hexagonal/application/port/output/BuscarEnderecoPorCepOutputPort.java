package com.vitorcamposdsilva.hexagonal.application.port.output;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Endereco;

public interface BuscarEnderecoPorCepOutputPort {
    Endereco find(String cep);
}
