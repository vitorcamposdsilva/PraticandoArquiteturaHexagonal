package com.vitorcamposdsilva.hexagonal.application.port.input;

import com.vitorcamposdsilva.hexagonal.application.core.doman.Cliente;


public interface CadastrarClienteInputPort {

    void cadastrarCliente(Cliente cliente, String cep);
}
