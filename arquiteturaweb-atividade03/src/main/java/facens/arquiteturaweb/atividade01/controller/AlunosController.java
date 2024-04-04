package facens.arquiteturaweb.atividade01.controller;

import facens.arquiteturaweb.atividade01.modelo.Alunos;
import facens.arquiteturaweb.atividade01.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunosController {

    private final AlunoService alunoService;

    /*
     a injeção de dependência é visível no construtor da classe TaskController. TaskController depende de TaskService,
     que é passado como um parâmetro no construtor. O Spring será responsável por injetar uma instância de TaskService
     quando criar uma instância de TaskController.
     */
    public AlunosController(AlunoService alunoService) {
         this.alunoService = alunoService;
    }

    @GetMapping
    public List<Alunos> getAllAlunos() {
        return alunoService.getAllAlunos();
    }

    @GetMapping("/{id}")
    public Alunos getAlunosById(@PathVariable Long id) {
        return alunoService.getAlunosById(id);
    }

    @PostMapping("/add")
    public Alunos addAluno(@RequestBody Alunos alunos) {
        return alunoService.addAluno(alunos);
    }
}


