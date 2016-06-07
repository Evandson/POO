package Atividade;

/**
 * Created by Evandson Maranhão on 12/05/2016.
 */
public class Disciplina implements Acoes{
    int codigo;
    String nome;
    Professor professor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    @Override
    public void add() {

    }

    @Override
    public void exibir() {

    }
}
