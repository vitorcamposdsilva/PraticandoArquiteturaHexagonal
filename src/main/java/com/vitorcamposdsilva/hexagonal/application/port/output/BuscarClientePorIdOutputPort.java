package com.vitorcamposdsilva.hexagonal.application.port.output;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;

import java.util.Optional;

public interface BuscarClientePorIdOutputPort {

    Optional<Cliente> find(String id);
}
