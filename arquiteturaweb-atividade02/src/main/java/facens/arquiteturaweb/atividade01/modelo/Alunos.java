package facens.arquiteturaweb.atividade01.modelo;

public class Alunos {
    private Long id;
    private String nome;
    private Integer idade;
    private  Integer RA;
    private String curso;




    public Alunos(Long id, String nome, Integer idade, Integer RA, String curso ) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.RA = RA;
        this.curso = curso;
    }



    // Getters e Setters (exemplo)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getRA() {
        return RA;
    }

    public void setRA(Integer RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



}

