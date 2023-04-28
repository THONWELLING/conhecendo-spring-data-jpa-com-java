package com.thonwelling.academiadigital.controllers;

import com.thonwelling.academiadigital.dtos.MatriculaDto;
import com.thonwelling.academiadigital.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
  @Autowired
  MatriculaServiceImpl service;

  @PostMapping
  public MatriculaDto criarMatricula(@Valid @RequestBody MatriculaDto matricula) {
    return service.create(matricula);
  }

  @GetMapping
  public List<MatriculaDto> listarTodasAsMatriculas(@RequestParam(value = "bairro", required = false) String bairro){
    return service.getAll(bairro);
  }
}
