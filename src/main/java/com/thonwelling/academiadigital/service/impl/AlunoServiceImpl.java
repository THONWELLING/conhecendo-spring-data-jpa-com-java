package com.thonwelling.academiadigital.service.impl;

import com.thonwelling.academiadigital.entity.Aluno;
import com.thonwelling.academiadigital.entity.dtos.AlunoDto;
import com.thonwelling.academiadigital.entity.dtos.AlunoUpdateDto;
import com.thonwelling.academiadigital.repository.AlunoRepository;
import com.thonwelling.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {
  @Autowired
  AlunoRepository repository;

  @Override
  public Aluno create(AlunoDto alunoDto) {
    Aluno aluno = new Aluno();
    aluno.setNome(alunoDto.getNome());
    aluno.setCpf(alunoDto.getCpf());
    aluno.setBairro(alunoDto.getBairro());
    aluno.setDataDeNascimento(alunoDto.getDataDeNascimento());
    return repository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {
    return null;
  }

  @Override
  public List<Aluno> getAll() {
    return repository.findAll();
  }

  @Override
  public Aluno update(Long id, AlunoUpdateDto updateDto) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
