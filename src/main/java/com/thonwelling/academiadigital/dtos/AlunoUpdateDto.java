package com.thonwelling.academiadigital.dtos;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class AlunoUpdateDto {

  private String nome;
  private String bairro;
  private LocalDate dataDeNascimento;
}
