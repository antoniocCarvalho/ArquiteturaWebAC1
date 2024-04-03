package facens.arquiteturaweb.atividade01.service;

import facens.arquiteturaweb.atividade01.modelo.Alunos;

import java.util.List;

public interface AlunoService {
    List<Alunos> getAllAlunos();
    Alunos getAlunosById(Long id);
    Alunos addAluno(Alunos alunos);

}
