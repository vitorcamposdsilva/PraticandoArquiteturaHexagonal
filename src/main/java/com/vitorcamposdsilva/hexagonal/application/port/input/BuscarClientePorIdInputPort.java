package com.vitorcamposdsilva.hexagonal.application.port.input;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;


public interface BuscarClientePorIdInputPort {
    Cliente buscarClientePorId(String id);
}
