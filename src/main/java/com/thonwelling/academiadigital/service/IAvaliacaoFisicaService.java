package com.thonwelling.academiadigital.service;

import com.thonwelling.academiadigital.entity.AvaliacaoFisica;
import com.thonwelling.academiadigital.dtos.AvaliacaoFisicaDto;
import com.thonwelling.academiadigital.dtos.AvaliacaoFisicaUpdateDto;

import java.util.List;

public interface IAvaliacaoFisicaService {
  AvaliacaoFisica create(AvaliacaoFisicaDto form);

  AvaliacaoFisica get(Long id);

  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto formUpdate);

  void delete(Long id);
}
