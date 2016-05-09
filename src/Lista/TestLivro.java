package Lista;

/**
 * Created by Evandson Maranhão on 08/05/2016.
 */
public class TestLivro {

    public static void main(String[] args) {

        Livro l1 = new Livro();

        int c = l1.codigo = 123;
        String t = l1.titulo = "Java Como Programar";
        String d = l1.descricao = "Livro de Programação Java";
        String a = l1.autor = "Paul Deitel";
        System.out.println(" Codigo: "+c+"\n Título: "+t+"\n Descrição: "+d+"\n Autor: "+a);
    }
}