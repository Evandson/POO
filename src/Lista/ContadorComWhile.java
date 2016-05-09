package Lista;

/**
 * Created by Evandson Maranhão on 09/05/2016.
 */
class ContadorComWhile
{
    public static void main(String[] args) {
        int contador = 0;
        while(contador != 100)
            contador = contador + 3;
    }
}

class ContadorComFor
{
    public static void main(String[] args) {
        //loop infinito, a condição de parada não tem incremento para atualizar seu valor.
        double a, b = 1;
        for (a = 0; a < 1000; b++)
        {
            System.out.println(a+""+b);
        }
    }
}

class Vetores {
    public static void main(String[] args) {

        int[] inversos = {1, 2 ,3, 4, 10, 11, 12, 13, 20};

       System.out.println(inversos[3]);
    }
}
