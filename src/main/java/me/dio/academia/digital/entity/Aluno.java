package me.dio.academia.digital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Aluno {
  @Id
  private Long id;
  @Column
  private String nome;
  @Column
  private String cpf;
  @Column
  private String bairro;
  @Column
  private LocalDate dataDeNascimento;
  @Column
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}
