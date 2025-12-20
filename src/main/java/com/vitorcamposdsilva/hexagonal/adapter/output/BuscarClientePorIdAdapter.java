package com.vitorcamposdsilva.hexagonal.adapter.output;


import com.vitorcamposdsilva.hexagonal.adapter.output.repository.ClienteRepository;
import com.vitorcamposdsilva.hexagonal.adapter.output.repository.mapper.ClienteEntityMapper;
import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarClientePorIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuscarClientePorIdAdapter implements BuscarClientePorIdOutputPort {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteEntityMapper mapper;
    @Override
    public Optional<Cliente> find(String id) {
        var clienteEntity = repository.findById(id);
        return clienteEntity.map(entity ->mapper.toCliente(entity));

    }
}
