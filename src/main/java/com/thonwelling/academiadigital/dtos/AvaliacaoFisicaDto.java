package com.thonwelling.academiadigital.dtos;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonPropertyOrder({"alunoId", "peso", "altura"})
public class AvaliacaoFisicaDto {

  private Long alunoId;
  private double peso;
  private double altura;
}
