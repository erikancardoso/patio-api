package com.mottu.patio.dto;

import jakarta.validation.constraints.NotBlank;

public class PatioCreateDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String endereco;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

