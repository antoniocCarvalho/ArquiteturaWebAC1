package facens.arquiteturaweb.atividade01.service;

import facens.arquiteturaweb.atividade01.modelo.Alunos;
import facens.arquiteturaweb.atividade01.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlunoServiceIMP implements AlunoService {

    private final AlunoRepository alunoRepository;

    /*
    A injeção de dependência está evidenciada no construtor da classe TaskService. Aqui, TaskService depende de
    TaskRepository, que é passado como um parâmetro no construtor. O Spring será responsável por injetar uma instância
    de TaskRepository quando criar uma instância de TaskService.
     */
    public AlunoServiceIMP(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Alunos> getAllAlunos() {
        return alunoRepository.getAll();
    }

    @Override
    public Alunos getAlunosById(Long id) {
        return alunoRepository.findById(id);
    }



    @Override
    public Alunos addAluno(Alunos alunos) {
        return alunoRepository.add(alunos);
    }
}
