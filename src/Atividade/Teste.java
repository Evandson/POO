package Atividade;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/**
 * Created by Evandson Maranhão on 12/05/2016.
 */
public class Teste {

    //public static Professor criarProfessor(String nome, String cpf) {
        //Professor professor = new Professor(nome, cpf);
        //return professor;
    //}

    public static void Inserir(Acoes o){
        o.add();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            System.out.println("Informe sua opção:\n 1-Criar Professor\n 2-Criar Disciplina \n " +
                    "3-Criar Turma \n 4-Inserir aluno na turma\n 5-Listar alunos\n 6-Listar turma");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    Inserir(new Professor(nome));
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
            System.out.println("Deseja sair? s-SIM / n-NÃO");
            // n = sc.nextLine();
        }
    }
}