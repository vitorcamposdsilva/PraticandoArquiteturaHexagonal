package com.vitorcamposdsilva.hexagonal.adapter.output;

import com.vitorcamposdsilva.hexagonal.adapter.output.repository.ClienteRepository;
import com.vitorcamposdsilva.hexagonal.application.port.output.DeletarClientePorIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletarClientePorIdAdapter implements DeletarClientePorIdOutputPort {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void deletar(String id) {
        clienteRepository.deleteById(id);
    }
}
