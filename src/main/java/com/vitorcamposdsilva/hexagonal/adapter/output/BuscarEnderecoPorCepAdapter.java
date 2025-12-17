package com.vitorcamposdsilva.hexagonal.adapter.output;

import com.vitorcamposdsilva.hexagonal.adapter.output.client.BuscarEnderecoPorCepClient;
import com.vitorcamposdsilva.hexagonal.adapter.output.client.mapper.EnderecoResponseMapper;
import com.vitorcamposdsilva.hexagonal.adapter.output.client.response.EnderecoResponse;
import com.vitorcamposdsilva.hexagonal.application.core.doman.Endereco;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarEnderecoPorCepOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoPorCepAdapter implements BuscarEnderecoPorCepOutputPort {
    @Autowired
    BuscarEnderecoPorCepClient client;

    @Autowired
    EnderecoResponseMapper mapper;
    @Override
    public Endereco find(String cep) {
        var enderecoResponse = client.find(cep);
        return mapper.toEndereco(enderecoResponse);
    }
}
