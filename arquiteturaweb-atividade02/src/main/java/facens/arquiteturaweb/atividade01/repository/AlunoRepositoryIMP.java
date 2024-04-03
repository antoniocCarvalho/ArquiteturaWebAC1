package facens.arquiteturaweb.atividade01.repository;

import facens.arquiteturaweb.atividade01.modelo.Alunos;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlunoRepositoryIMP implements AlunoRepository {

        private List<Alunos> alunos = new ArrayList<>();
        private Long nextId = 1L;

        public AlunoRepositoryIMP() {
            alunos.add(new Alunos(nextId++, "Teste123", 19, 211949, "ADS"));
            alunos.add(new Alunos(nextId++, "Teste454", 65, 9993, "ADS"));
        }


        @Override
        public List<Alunos> getAll() {
            return alunos;
        }

        public Alunos findById(@PathVariable Long id) {
            return alunos.stream()
                    .filter(aluno -> aluno.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }



        public Alunos add( Alunos aluno) {
            aluno.setId(nextId++);
            alunos.add(aluno);
            System.out.println("Aluno adicionado: " + aluno);
            return aluno;
        }

    }






