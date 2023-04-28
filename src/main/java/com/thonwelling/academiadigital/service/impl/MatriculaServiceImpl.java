package com.thonwelling.academiadigital.service.impl;

import com.thonwelling.academiadigital.dtos.AlunoDto;
import com.thonwelling.academiadigital.dtos.MatriculaDto;
import com.thonwelling.academiadigital.entity.Aluno;
import com.thonwelling.academiadigital.entity.Matricula;
import com.thonwelling.academiadigital.mapper.ModelMapperMapping;
import com.thonwelling.academiadigital.repository.AlunoRepository;
import com.thonwelling.academiadigital.repository.MatriculaRepository;
import com.thonwelling.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
  @Autowired
  MatriculaRepository repository;
  @Autowired
  AlunoRepository alunoRepository;

  @Override
  public MatriculaDto create(MatriculaDto matriculaDto) {
    Matricula matricula = ModelMapperMapping.parseObject(matriculaDto, Matricula.class);
    Aluno aluno = alunoRepository.findById(matriculaDto.getAlunoId()).get();

    matricula.setAluno(aluno);
    Matricula matriculaSalva = repository.save(matricula);

    return ModelMapperMapping.parseObject(matriculaSalva, MatriculaDto.class);
  }

  @Override
  public MatriculaDto get(Long id) {
    return ModelMapperMapping.parseObject(repository.findById(id), MatriculaDto.class);
  }

  @Override
  public List<MatriculaDto> getAll(String bairro) {
    List<Matricula> matriculas;
    if(bairro == null){
      matriculas = repository.findAll();
    }else{
      matriculas = ModelMapperMapping.parseListObjects(repository.findAlunosMatriculadosBairro(bairro), Matricula.class);
    }
    return ModelMapperMapping.parseListObjects(matriculas, MatriculaDto.class);

  }

  @Override
  public void delete(Long id) {

  }
}
