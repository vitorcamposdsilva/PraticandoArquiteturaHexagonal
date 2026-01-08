package com.vitorcamposdsilva.hexagonal.application.core.usecase;

import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.input.BuscarClientePorIdInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.AtualizarDadosClienteOutputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarEnderecoPorCepOutputPort;

public class  AtualizarDadosClienteUseCase {

    private final BuscarClientePorIdInputPort buscarClientePorIdInputPort;
    private final BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort;
    private final AtualizarDadosClienteOutputPort atualizarDadosClienteOutputPort;

    public AtualizarDadosClienteUseCase(BuscarClientePorIdInputPort buscarClientePorIdInputPort, BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort, AtualizarDadosClienteOutputPort atualizarDadosClienteOutputPort) {
        this.buscarClientePorIdInputPort = buscarClientePorIdInputPort;
        this.buscarEnderecoPorCepOutputPort = buscarEnderecoPorCepOutputPort;
        this.atualizarDadosClienteOutputPort = atualizarDadosClienteOutputPort;
    }

    public void atualizar(Cliente cliente, String cep){
        buscarClientePorIdInputPort.buscarClientePorId(cliente.getId());
        var endereco = buscarEnderecoPorCepOutputPort.find(cep);
        cliente.setEndereco(endereco);
        atualizarDadosClienteOutputPort.atualizarDadosClienteOutputPort(cliente);
    }
}
