package com.vitorcamposdsilva.hexagonal.application.port.output;

import com.vitorcamposdsilva.hexagonal.application.core.doman.Endereco;

public interface BuscarEnderecoPorCepOutputPort {
    Endereco find(String cep);
}
