package Atividade;

/**
 * Created by Evandson Maranhão on 12/05/2016.
 */
public class Turma implements Acoes{
    String nome;
    Professor professor;
    Disciplina disciplina;
    Aluno aluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public void add() {
    }

    @Override
    public void exibir() {

    }
}
