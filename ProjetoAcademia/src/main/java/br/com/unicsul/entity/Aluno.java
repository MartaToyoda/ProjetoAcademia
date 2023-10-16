package br.com.unicsul.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

    @Getter @Setter @NoArgsConstructor
    @Entity
    @Table (name= "alunos")
    public class Aluno implements Serializable {

        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
        @Column (name = "id")
        private Long id;

        @Column (name= "nome", nullable = false, unique = true, length = 255)
        private String nome;

        @Column (name = "peso", nullable = false, unique = false, length = 3)
        private float peso;

        @Column (name = "altura", nullable = false, unique = false, length = 3)
        private float altura;

        @Column (name = "data_criacao")
        private LocalDateTime dataCriacao;

        @Column (name = "data_exclucao")
        private LocalDateTime dataExclusao;

        @Override
        public boolean equals (Object o ) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Aluno aluno = (Aluno) o;
            return Objects.equals(id, aluno.id);
        }
        @Override
        public int hashCode() {
         return Objects.hash(id);
        }
        @Override
        public String toString() {
            return "Aluno{" +
                    "id=" + id +
                    ')';
        }

    }

