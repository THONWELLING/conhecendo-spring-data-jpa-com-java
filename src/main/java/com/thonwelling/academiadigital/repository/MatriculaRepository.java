package com.thonwelling.academiadigital.repository;

import com.thonwelling.academiadigital.dtos.MatriculaDto;
import com.thonwelling.academiadigital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

  @Query(value = "SELECT * FROM matriculas m " +
      "INNER JOIN alunos a ON m.aluno_id = a.id " +
      "WHERE a.bairro = :bairro", nativeQuery = true)
    //@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
  List<MatriculaDto> findAlunosMatriculadosBairro(String bairro);
}
