package com.vitorcamposdsilva.hexagonal.application.port.output;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;

public interface AtualizarDadosClienteOutputPort {
    void atualizarDadosClienteOutputPort(Cliente cliente);
}
