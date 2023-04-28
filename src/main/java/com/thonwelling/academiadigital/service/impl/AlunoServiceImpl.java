package com.thonwelling.academiadigital.service.impl;

import com.thonwelling.academiadigital.entity.Aluno;
import com.thonwelling.academiadigital.entity.AvaliacaoFisica;
import com.thonwelling.academiadigital.dtos.AlunoDto;
import com.thonwelling.academiadigital.mapper.ModelMapperMapping;
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
  public AlunoDto create(AlunoDto aluno) {
    var entity = ModelMapperMapping.parseObject(aluno, Aluno.class);
    return ModelMapperMapping.parseObject(repository.save(entity), AlunoDto.class);
  }

  @Override
  public AlunoDto get(Long id) {
    var entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Nenhum Dado Encontrado Para Este Id"));
    return ModelMapperMapping.parseObject(entity, AlunoDto.class);
  }

  @Override
  public List<AlunoDto> getAll() {
    return ModelMapperMapping.parseListObjects(repository.findAll(), AlunoDto.class);
  }

  @Override
  public AlunoDto update(AlunoDto aluno) {
    var entity = repository.findById(aluno.getId()).orElseThrow(() -> new RuntimeException("Nenhum Dado Encontrado Para Este Id"));

    entity.setNome(aluno.getNome());
    entity.setCpf(aluno.getCpf());
    entity.setBairro(aluno.getBairro());
    entity.setDataDeNascimento(aluno.getDataDeNascimento());
    return ModelMapperMapping.parseObject(repository.save(entity), AlunoDto.class);
  }

  @Override
  public void delete(Long id) {
    var entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Nenhum Dado Encontrado Para Este Id"));
    repository.delete(entity);
  }

  @Override
  public List<AvaliacaoFisica> listarTodasAvaliacoesFisicas(Long id) {
    Aluno aluno = repository.findById(id).get();
    return aluno.getAvaliacoes();
  }
}
