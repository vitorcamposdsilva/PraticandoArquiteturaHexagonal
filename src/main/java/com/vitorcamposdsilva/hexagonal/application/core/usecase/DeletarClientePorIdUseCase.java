package com.vitorcamposdsilva.hexagonal.application.core.usecase;

import com.vitorcamposdsilva.hexagonal.application.port.input.BuscarClientePorIdInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.input.DeletarClientePorIdInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.DeletarClientePorIdOutputPort;

public class DeletarClientePorIdUseCase implements DeletarClientePorIdInputPort {

    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;

    private final DeletarClientePorIdOutputPort deletarClientePorIdOutputPort;

    public DeletarClientePorIdUseCase(BuscarClientePorIdInputPort buscarClientePorIdInputPort, DeletarClientePorIdOutputPort deletarClientePorIdOutputPort) {
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.deletarClientePorIdOutputPort = deletarClientePorIdOutputPort;
    }

    @Override
    public void deletar(String id){
        buscarClientePorIdInputPort.buscarClientePorId(id);
        deletarClientePorIdOutputPort.deletar(id);
    }
}
