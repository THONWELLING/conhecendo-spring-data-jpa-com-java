package com.thonwelling.academiadigital.service;

import com.thonwelling.academiadigital.entity.Aluno;
import com.thonwelling.academiadigital.entity.dtos.AlunoDto;
import com.thonwelling.academiadigital.entity.dtos.AlunoUpdateDto;

import java.util.List;

public interface IAlunoService {

  Aluno create(AlunoDto form);

  Aluno get(Long id);

  List<Aluno> getAll();

  Aluno update(Long id, AlunoUpdateDto formUpdate);

  void delete(Long id);
}
