package com.vitorcamposdsilva.hexagonal.application.core.usecase;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.input.BuscarClientePorIdInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarClientePorIdOutputPort;

public class BuscarClientePorIdUseCase implements BuscarClientePorIdInputPort {

    private final BuscarClientePorIdOutputPort buscarClientePorIdOutputPort;

    public BuscarClientePorIdUseCase(BuscarClientePorIdOutputPort buscarClientePorIdOutputPort) {
        this.buscarClientePorIdOutputPort = buscarClientePorIdOutputPort;
    }

    @Override
    public Cliente buscarClientePorId(String id) {
        return buscarClientePorIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
