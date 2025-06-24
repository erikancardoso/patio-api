package com.mottu.patio.dto;

public class MotoDTO {
    private Long id;
    private String placa;
    private String status;
    private Long patioId;

    // classe construtora
    public MotoDTO(Long id, String placa, String status, Long patioId) {
        this.id = id;
        this.placa = placa;
        this.status = status;
        this.patioId = patioId;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getStatus() {
        return status;
    }

    public Long getPatioId() {
        return patioId;
    }
}
