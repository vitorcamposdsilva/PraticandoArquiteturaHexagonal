package com.vitorcamposdsilva.hexagonal.adapter.output.client.mapper;



import com.vitorcamposdsilva.hexagonal.adapter.output.client.response.EnderecoResponse;
import com.vitorcamposdsilva.hexagonal.application.core.domain.Endereco;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface EnderecoResponseMapper {
    Endereco toEndereco(EnderecoResponse enderecoResponse);
}
