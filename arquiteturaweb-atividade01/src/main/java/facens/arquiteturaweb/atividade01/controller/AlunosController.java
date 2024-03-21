package facens.arquiteturaweb.atividade01.controller;

import facens.arquiteturaweb.atividade01.modelo.Alunos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunosController {

    private List<Alunos> alunos = new ArrayList<>();
    private Long nextId = 1L;

    public AlunosController() {
        alunos.add(new Alunos(nextId++, "Teste123", 19, 211949, "ADS"));
        alunos.add(new Alunos(nextId++, "Teste454", 65, 9993, "ADS"));
    }

    @GetMapping("/all")
    public List<Alunos> getAllAlunos() {
        return alunos;
    }

    @GetMapping("/{id}")
    public Alunos getAlunosById(@PathVariable Long id) {
        return alunos.stream()
                .filter(aluno -> aluno.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/add")
    public Alunos addAluno(@RequestBody Alunos aluno) {
        aluno.setId(nextId++);
        alunos.add(aluno);
        System.out.println("Aluno adicionado: " + aluno);
        return aluno;
    }

}
