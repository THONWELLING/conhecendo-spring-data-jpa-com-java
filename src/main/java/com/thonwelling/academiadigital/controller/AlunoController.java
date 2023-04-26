package com.thonwelling.academiadigital.controller;

import com.thonwelling.academiadigital.entity.Aluno;
import com.thonwelling.academiadigital.entity.AvaliacaoFisica;
import com.thonwelling.academiadigital.entity.dtos.AlunoDto;
import com.thonwelling.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  AlunoServiceImpl service;

  @GetMapping("/{id}")
  public List<Aluno> listarTodosAlunos () {
    return service.getAll();
  }

  @PostMapping
  public Aluno criarAluno(@RequestBody AlunoDto dto){
    return service.create(dto);
  }
  @GetMapping("/avaliacoes/{id}")
  public List<AvaliacaoFisica> listarTodasAvaliacoesFisicas(@PathVariable Long id){
    return service.listarTodasAvaliacoesFisicas(id);
  }

  @GetMapping
  public Aluno buscarAlunoPorId(@PathVariable Long id){
    return service.get(id);
  }
}
