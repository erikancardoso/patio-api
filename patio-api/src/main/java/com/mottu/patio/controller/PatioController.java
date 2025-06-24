package com.mottu.patio.controller;

import com.mottu.patio.dto.PatioCreateDTO;
import com.mottu.patio.dto.PatioDTO;
import com.mottu.patio.service.PatioService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/patios")
@Tag(name = "Pátios", description = "Operações relacionadas aos pátios")
public class PatioController {

    private final PatioService patioService;

    public PatioController(PatioService patioService) {
        this.patioService = patioService;
    }

    @PostMapping
    @Operation(summary = "Criar novo pátio", description = "Cria um novo pátio no sistema.")
    public ResponseEntity<PatioDTO> create(@RequestBody @Valid PatioCreateDTO dto) {
        PatioDTO created = patioService.create(dto);
        return ResponseEntity.created(URI.create("/api/patios/" + created.getId())).body(created);
    }

    @GetMapping
    public ResponseEntity<List<PatioDTO>> findAll() {
        return ResponseEntity.ok(patioService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar pátio por ID", description = "Retorna os dados de um pátio específico.")
    public ResponseEntity<PatioDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(patioService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        patioService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<PatioDTO> atualizarPatio(@PathVariable Long id, @RequestBody PatioCreateDTO dto) {
        PatioDTO atualizado = patioService.atualizarPatio(id, dto);
        return ResponseEntity.ok(atualizado);
    }
}
