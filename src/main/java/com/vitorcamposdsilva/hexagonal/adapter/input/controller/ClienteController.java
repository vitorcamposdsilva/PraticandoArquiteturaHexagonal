package com.vitorcamposdsilva.hexagonal.adapter.input.controller;

import com.vitorcamposdsilva.hexagonal.adapter.input.controller.mapper.ClienteMapper;
import com.vitorcamposdsilva.hexagonal.adapter.input.controller.request.ClienteRequest;

import com.vitorcamposdsilva.hexagonal.adapter.input.controller.respose.ClienteRespose;
import com.vitorcamposdsilva.hexagonal.application.core.domain.Cliente;
import com.vitorcamposdsilva.hexagonal.application.port.input.AtualizarDadosClienteInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.input.CadastrarClienteInputPort;
import com.vitorcamposdsilva.hexagonal.application.port.output.BuscarClientePorIdOutputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private CadastrarClienteInputPort cadastrarClienteInputPort;

    @Autowired
    private ClienteMapper mapper;

    @Autowired
    private BuscarClientePorIdOutputPort buscarClientePorIdOutputPort;

    @Autowired
    private AtualizarDadosClienteInputPort atualizarDadosClienteInputPort;

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

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarPorId(@PathVariable final String id, @Valid @RequestBody ClienteRequest clienteRequest){
        Cliente cliente = mapper.toCliente(clienteRequest);
        cliente.setId(id);
        atualizarDadosClienteInputPort.atualizar(cliente,clienteRequest.getCep());
        return ResponseEntity.noContent().build();
    }
}
