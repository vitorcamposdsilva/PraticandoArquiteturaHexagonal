package com.vitorcamposdsilva.hexagonal.adapter.output.repository;

import com.vitorcamposdsilva.hexagonal.adapter.output.repository.entity.ClienteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {
}
