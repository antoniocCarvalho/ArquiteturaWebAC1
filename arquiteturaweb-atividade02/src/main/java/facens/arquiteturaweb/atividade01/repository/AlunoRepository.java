package facens.arquiteturaweb.atividade01.repository;


import facens.arquiteturaweb.atividade01.modelo.Alunos;

import java.util.List;

public interface AlunoRepository {

    List<Alunos> getAll();
    Alunos findById(Long id);
    Alunos add(Alunos aluno);

}


