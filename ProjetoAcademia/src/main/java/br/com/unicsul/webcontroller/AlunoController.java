package br.com.unicsul.webcontroller;

import br.com.unicsul.entity.Aluno;
import br.com.unicsul.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RequiredArgsConstructor
    @RestController
    @RequestMapping("ap1/v1/alunos")
    public class AlunoController {

        private final AlunoService alunoService;

        @PostMapping
        public ResponseEntity<Aluno> create(@RequestBody Aluno aluno){
            Aluno a1 = alunoService.salvar(aluno);
            return ResponseEntity.status(HttpStatus.CREATED).body(a1);
        }



    }
