package com.thonwelling.academiadigital.service;

import com.thonwelling.academiadigital.entity.Matricula;
import com.thonwelling.academiadigital.entity.dtos.MatriculaDto;

import java.util.List;

public interface IMatriculaService {
  Matricula create(MatriculaDto form);
  Matricula get(Long id);

  List<Matricula> getAll();

  void delete(Long id);

}
