package com.vitorcamposdsilva.hexagonal.application.port.input;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;

public interface AtualizarDadosClienteInputPort {
    void atualizar(Cliente cliente, String cep);
}
