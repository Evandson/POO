/**
 * Created by usuario on 28/04/2016.
 */
public class Circulo implements Calculo{

    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return 2 * 3.14 * raio;
    }

    @Override
    public double calculaPerimetro() {
        return 3.14 * (raio * raio);
    }
}
