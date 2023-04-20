package me.dio.academia.digital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Matricula {
  @Id
  private Long id;
  @Column
  private Aluno aluno;
  @Column
  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
