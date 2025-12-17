package com.vitorcamposdsilva.hexagonal.adapter.output.client;

import com.vitorcamposdsilva.hexagonal.adapter.output.client.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "BuscarEnderecoPorCepClient", url = "${vitorcamposdsilva.client.address.url}")
public interface BuscarEnderecoPorCepClient {

    @GetMapping("/{cep}")
    EnderecoResponse find(@PathVariable("cep") String cep);
}
