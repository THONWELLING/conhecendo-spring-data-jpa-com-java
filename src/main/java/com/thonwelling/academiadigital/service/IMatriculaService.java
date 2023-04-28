package com.thonwelling.academiadigital.service;

import com.thonwelling.academiadigital.dtos.MatriculaDto;

import java.util.List;

public interface IMatriculaService {
  MatriculaDto create(MatriculaDto form);
  MatriculaDto get(Long id);

  List<MatriculaDto> matriculasPorBairro(String bairro);

  void delete(Long id);

}
