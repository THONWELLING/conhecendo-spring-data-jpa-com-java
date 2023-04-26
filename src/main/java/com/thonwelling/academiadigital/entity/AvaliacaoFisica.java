package com.thonwelling.academiadigital.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@Entity
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Setter
@Table(name = "avaliacao_fisica")
public class AvaliacaoFisica {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;
  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();
  @Column(name = "peso_atual")
  private double peso;
  @Column(name = "altura_atual")
  private double altura;
}
