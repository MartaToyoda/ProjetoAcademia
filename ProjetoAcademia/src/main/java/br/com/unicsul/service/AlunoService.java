package br.com.unicsul.service;

import br.com.unicsul.entity.Aluno;
import br.com.unicsul.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
    @Service
    public class AlunoService {

        private final AlunoRepository alunoRepository;

        @Transactional
        public Aluno salvar(Aluno aluno) {
            return alunoRepository.save(aluno);
        }
    }
