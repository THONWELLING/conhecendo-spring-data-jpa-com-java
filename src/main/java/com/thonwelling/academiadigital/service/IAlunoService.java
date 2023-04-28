package com.thonwelling.academiadigital.service;

import com.thonwelling.academiadigital.entity.AvaliacaoFisica;
import com.thonwelling.academiadigital.dtos.AlunoDto;

import java.util.List;

public interface IAlunoService {

  AlunoDto create(AlunoDto form);

  AlunoDto get(Long id);

  List<AlunoDto> getAll();

  AlunoDto update(AlunoDto aluno);

  void delete(Long id);

  List<AvaliacaoFisica> listarTodasAvaliacoesFisicas(Long id);
}
