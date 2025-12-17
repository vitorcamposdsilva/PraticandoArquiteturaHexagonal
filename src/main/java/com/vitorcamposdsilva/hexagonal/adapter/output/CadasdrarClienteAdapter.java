package com.vitorcamposdsilva.hexagonal.adapter.output;

import com.vitorcamposdsilva.hexagonal.adapter.output.repository.ClienteRepository;
import com.vitorcamposdsilva.hexagonal.adapter.output.repository.mapper.ClienteEntityMapper;
import com.vitorcamposdsilva.hexagonal.application.core.doman.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.output.CadastrarClienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadasdrarClienteAdapter implements CadastrarClienteOutputPort {
    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteEntityMapper mapper;

    @Override
    public void cadastrarCliente(Cliente cliente) {
        var clienteEntity = mapper.toCustomerEntity(cliente);
        repository.save(clienteEntity);
    }
}
