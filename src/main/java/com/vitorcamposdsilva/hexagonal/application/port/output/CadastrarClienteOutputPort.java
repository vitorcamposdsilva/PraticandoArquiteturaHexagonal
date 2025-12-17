package com.vitorcamposdsilva.hexagonal.application.port.output;

import com.vitorcamposdsilva.hexagonal.application.core.doman.Cliente;

public interface CadastrarClienteOutputPort {

    void cadastrarCliente(Cliente cliente);
}
