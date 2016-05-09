package Aulas;

/**
 * Created by Evandson Maranhão on 09/05/2016.
 */

public class Triangulo {
    Ponto a;
    Ponto b;
    Ponto c;

    public Triangulo(Ponto pontoA, Ponto pontoB, Ponto pontoC){
        a = pontoA;
        b = pontoB;
        c = pontoC;
    }

    public double perimetro(){
        double resultado;

        double lado1, lado2, lado3;
        lado1 = a.distanciaOutroPonto(b);
        lado2 = b.distanciaOutroPonto(c);
        lado3 = c.distanciaOutroPonto(a);
        resultado = lado1+lado2+lado3;

        return resultado;
    }

    public double area(){
        double resultado, semi_perimetro;
        double lado1, lado2, lado3;
        lado1 = a.distanciaOutroPonto(b);
        lado2 = b.distanciaOutroPonto(c);
        lado3 = c.distanciaOutroPonto(a);

        semi_perimetro = perimetro()/2;
        resultado = Math.sqrt(
                semi_perimetro*
                        (semi_perimetro - lado1)*
                        (semi_perimetro - lado2)*
                        (semi_perimetro - lado3)
        );

        return resultado;
    }
}
