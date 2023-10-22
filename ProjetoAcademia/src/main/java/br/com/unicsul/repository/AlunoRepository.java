package br.com.unicsul.repository;

import br.com.unicsul.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface AlunoRepository extends JpaRepository<Aluno, Long> {


    }