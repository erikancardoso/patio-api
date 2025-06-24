package com.mottu.patio.dto;

import com.mottu.patio.entity.Patio;

public class PatioDTO {

    private Long id;
    private String nome;
    private String endereco;

    public PatioDTO(Long id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }
    public static PatioDTO fromEntity(Patio patio) {
        return new PatioDTO(patio.getId(), patio.getNome(), patio.getEndereco());
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
