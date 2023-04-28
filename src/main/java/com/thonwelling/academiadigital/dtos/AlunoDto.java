package com.thonwelling.academiadigital.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Getter
@Setter
@JsonPropertyOrder({"id", "nome", "cpf", "bairro", "dataDeNascimento"})
public class AlunoDto {
  private Long id;
  @NotEmpty(message = "Preencha o campo.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotEmpty(message = "Preencha o campo .")
  @CPF(message = "'${validatedValue}' é inválido!")
  @JsonProperty("documento")
  private String cpf;

  @NotEmpty(message = "Preencha o campo.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "Prencha o campo.")
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
