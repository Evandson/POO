package Matematica;

/**
 * Created by usuario on 28/04/2016.
 */
public class InterfaceTest {

    public static void areaCirculo(Calculo o){
        System.out.println(o.calculaArea());
    }

    public static void perimetroCirculo(Calculo o){
        System.out.println(o.calculaPerimetro());
    }
    public static void main(String[] args) {
        areaCirculo(new Circulo(2));
        perimetroCirculo(new Circulo(2));

    }
}
