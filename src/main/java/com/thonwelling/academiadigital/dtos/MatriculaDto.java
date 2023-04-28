package com.thonwelling.academiadigital.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MatriculaDto {

  @NotNull(message = "Preencha o campo.")
  @Positive(message = "O Id do aluno precisa ser positivo.")
  private Long alunoId;

}
