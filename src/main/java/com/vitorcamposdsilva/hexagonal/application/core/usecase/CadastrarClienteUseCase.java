package com.vitorcamposdsilva.hexagonal.application.core.usecase;

import com.vitorcamposdsilva.hexagonal.application.core.doman.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.input.CadastrarClienteInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarEnderecoPorCepOutputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.CadastrarClienteOutputPort;

public class CadastrarClienteUseCase implements CadastrarClienteInputPort {
    private final BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort;
    private final CadastrarClienteOutputPort cadastrarClienteOutputPort;

    public CadastrarClienteUseCase(BuscarEnderecoPorCepOutputPort buscarEnderecoPorCepOutputPort, CadastrarClienteOutputPort cadastrarClienteOutputPort) {
        this.buscarEnderecoPorCepOutputPort = buscarEnderecoPorCepOutputPort;
        this.cadastrarClienteOutputPort = cadastrarClienteOutputPort;
    }
    @Override
    public void cadastrarCliente(Cliente cliente, String cep){
        var endereco = buscarEnderecoPorCepOutputPort.find(cep);
        cliente.setEndereco(endereco);
        cadastrarClienteOutputPort.cadastrarCliente(cliente);
    }
}
