package com.vitorcamposdsilva.hexagonal.adapter.output;

import com.vitorcamposdsilva.hexagonal.adapter.output.repository.ClienteRepository;
import com.vitorcamposdsilva.hexagonal.adapter.output.repository.mapper.ClienteEntityMapper;
import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.output.AtualizarDadosClienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtualizarDadosClienteAdapter implements AtualizarDadosClienteOutputPort {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteEntityMapper mapper;
    @Override
    public void atualizarDadosClienteOutputPort(Cliente cliente) {
        var clienteEntity = mapper.toClienteEntity(cliente);
        repository.save(clienteEntity);
    }
}
