package com.thonwelling.academiadigital.controllers;

import com.thonwelling.academiadigital.entity.AvaliacaoFisica;
import com.thonwelling.academiadigital.dtos.AlunoDto;
import com.thonwelling.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  AlunoServiceImpl service;

  @GetMapping()
  public List<AlunoDto> listarTodosAlunos () {
    return service.getAll();
  }

  @PostMapping
  public AlunoDto criarAluno(@RequestBody AlunoDto dto){
    return service.create(dto);
  }
  @GetMapping("/{id}")
  public AlunoDto buscarAlunoPorId(@PathVariable Long id){
    return service.get(id);
  }

  @PutMapping()
  public AlunoDto atualizarAluno(@RequestBody AlunoDto aluno) {
    return service.update(aluno);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<?> deletarAluno(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }



}
