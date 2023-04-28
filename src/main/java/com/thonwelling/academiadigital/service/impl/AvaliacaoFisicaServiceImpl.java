package com.thonwelling.academiadigital.service.impl;

import com.thonwelling.academiadigital.entity.Aluno;
import com.thonwelling.academiadigital.entity.AvaliacaoFisica;
import com.thonwelling.academiadigital.dtos.AvaliacaoFisicaDto;
import com.thonwelling.academiadigital.dtos.AvaliacaoFisicaUpdateDto;
import com.thonwelling.academiadigital.repository.AlunoRepository;
import com.thonwelling.academiadigital.repository.AvaliacaoFisicaRepository;
import com.thonwelling.academiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
  @Autowired
  AvaliacaoFisicaRepository avaliacaoFisicaRepository;
  @Autowired
  AlunoRepository alunoRepository;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaDto avaliacaoFisicaDto) {
    AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
    Aluno aluno = alunoRepository.findById(avaliacaoFisicaDto.getAlunoId()).get();

    avaliacaoFisica.setAluno(aluno);
    avaliacaoFisica.setPeso(avaliacaoFisicaDto.getPeso());
    avaliacaoFisica.setAltura(avaliacaoFisica.getAltura());

    return avaliacaoFisicaRepository.save(avaliacaoFisica);
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    return null;
  }

  @Override
  public List<AvaliacaoFisica> getAll() {
    return null;
  }

  @Override
  public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
