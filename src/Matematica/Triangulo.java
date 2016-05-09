package Matematica;

/**
 * Created by usuario on 27/04/2016.
 */
public class Triangulo implements Calculo{
    double ponto;

    public Triangulo(double ponto){
        this.ponto = ponto;
    }

    public double calculaArea(){
        return 0;
    }

    public double calculaPerimetro(){
        return ponto + ponto + ponto;
    }

}
