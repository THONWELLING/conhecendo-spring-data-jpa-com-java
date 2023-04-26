package com.thonwelling.academiadigital.controller;

import com.thonwelling.academiadigital.entity.AvaliacaoFisica;
import com.thonwelling.academiadigital.entity.dtos.AvaliacaoFisicaDto;
import com.thonwelling.academiadigital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

  @Autowired
  AvaliacaoFisicaServiceImpl service;

  @PostMapping
  public AvaliacaoFisica criarAvaliacaoFisica(@RequestBody AvaliacaoFisicaDto avaliacaoFisicaDto) {
  return service.create(avaliacaoFisicaDto);
  }
}
