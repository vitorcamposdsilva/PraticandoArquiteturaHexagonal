package com.vitorcamposdsilva.hexagonal.application.core.usecase;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarClientePorIdOutputPort;

public class BuscarClientePorIdUseCase {

    private final BuscarClientePorIdOutputPort buscarClientePorIdOutputPort;

    public BuscarClientePorIdUseCase(BuscarClientePorIdOutputPort buscarClientePorIdOutputPort) {
        this.buscarClientePorIdOutputPort = buscarClientePorIdOutputPort;
    }

    public Cliente find(String id){
        return buscarClientePorIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
