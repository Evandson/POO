package Atividade;

import java.util.ArrayList;

/**
 * Created by Evandson Maranhão on 12/05/2016.
 */
public class Professor implements Acoes{
    String nome;

    ArrayList<String> professor = new ArrayList<>();

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void add() {
        professor.add(nome);
    }

    @Override
    public void exibir() {

    }
}
