package com.mottu.patio.dto;

import jakarta.validation.constraints.NotBlank;

public class MotoUpdateDTO {

    @NotBlank
    private String placa;

    @NotBlank
    private String status;

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

