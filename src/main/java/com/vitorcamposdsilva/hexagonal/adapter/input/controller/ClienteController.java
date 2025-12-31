package com.vitorcamposdsilva.hexagonal.adapter.input.controller;

import com.vitorcamposdsilva.hexagonal.adapter.input.controller.mapper.ClienteMapper;
import com.vitorcamposdsilva.hexagonal.adapter.input.controller.request.ClienteRequest;

import com.vitorcamposdsilva.hexagonal.adapter.input.controller.respose.ClienteRespose;
import com.vitorcamposdsilva.hexagonal.application.port.input.CadastrarClienteInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarClientePorIdOutputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
    @Autowired
    CadastrarClienteInputPort cadastrarClienteInputPort;

    @Autowired
    ClienteMapper mapper;

    @Autowired
    BuscarClientePorIdOutputPort buscarClientePorIdOutputPort;

    @PostMapping
    public ResponseEntity<Void> cadastrarCliente(@Valid @RequestBody ClienteRequest clienteRequest){
        var cliente = mapper.toCliente(clienteRequest);
        cadastrarClienteInputPort.cadastrarCliente(cliente, clienteRequest.getCep());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteRespose> bucarPorId(@PathVariable final String id){
        var cliente = buscarClientePorIdOutputPort.find(id);
        var clienteResponse = mapper.toClienteRespose(cliente);
        return ResponseEntity.ok().body(clienteResponse);
    }

}
