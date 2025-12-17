package com.vitorcamposdsilva.hexagonal.application.core.doman;

public class Customer {
    private String id;
    private String nome;
    private Endereco endereco;
    private String cpf;
    private Boolean validaCpf;

    public Customer() {
        this.validaCpf = false;
    }

    public Customer(String id, String nome, Endereco endereco, String cpf, Boolean validaCpf) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.validaCpf = validaCpf;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidaCpf() {
        return validaCpf;
    }

    public void setValidaCpf(Boolean validaCpf) {
        this.validaCpf = validaCpf;
    }
}
