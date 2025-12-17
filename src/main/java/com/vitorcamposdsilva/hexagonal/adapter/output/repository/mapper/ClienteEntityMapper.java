package com.vitorcamposdsilva.hexagonal.adapter.output.repository.mapper;

import com.vitorcamposdsilva.hexagonal.adapter.output.repository.entity.ClienteEntity;
import com.vitorcamposdsilva.hexagonal.application.core.doman.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {

    ClienteEntity toCustomerEntity(Cliente cliente);
}
