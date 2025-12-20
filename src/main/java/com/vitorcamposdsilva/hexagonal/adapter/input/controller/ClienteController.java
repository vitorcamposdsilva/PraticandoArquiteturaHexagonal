package com.vitorcamposdsilva.hexagonal.adapter.input.controller;

import com.vitorcamposdsilva.hexagonal.adapter.input.controller.mapper.ClienteMapper;
import com.vitorcamposdsilva.hexagonal.adapter.input.controller.request.ClienteRequest;

import com.vitorcamposdsilva.hexagonal.application.port.input.CadastrarClienteInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
    @Autowired
    CadastrarClienteInputPort cadastrarClienteInputPort;

    @Autowired
    ClienteMapper mapper;

    @PostMapping
    public ResponseEntity<Void> cadastrarCliente(@Valid @RequestBody ClienteRequest clienteRequest){
        var cliente = mapper.toCliente(clienteRequest);
        cadastrarClienteInputPort.cadastrarCliente(cliente, clienteRequest.getCep());
        return ResponseEntity.ok().build();
    }


}
