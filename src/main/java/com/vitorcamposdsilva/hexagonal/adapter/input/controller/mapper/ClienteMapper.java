package com.vitorcamposdsilva.hexagonal.adapter.input.controller.mapper;

import com.vitorcamposdsilva.hexagonal.adapter.input.controller.request.ClienteRequest;
import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "endereco", ignore = true)
    @Mapping(target = "validaCpf", ignore = true)
    Cliente toCliente(ClienteRequest clienteRequest);
}
