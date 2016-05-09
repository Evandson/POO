package Aulas;

/**
 * Created by Evandson Maranhão on 09/05/2016.
 */
public class Ponto {

        //Variáveis globais
        int x;
        int y;

        //Construtor
        public Ponto(int novoX, int novoY) {
            x = novoX;
            y = novoY;
        }

        //Métodos
        public int getX() {
            return x;
        }
        public void setX(int novoX) {
            x = novoX;
        }
        public int getY() {
            return y;
        }
        public void setY(int novoY) {
            y = novoY;
        }

        public double distanciaOrigem(){
            double distancia = Math.sqrt(
                    Math.pow((x-0), 2) +
                            Math.pow((y-0), 2));
            return distancia;
        }

        public double distanciaOutroPonto(Ponto ponto){
            double distancia = Math.sqrt(
                    Math.pow((x-ponto.getX()), 2) +
                            Math.pow((y-ponto.getY()), 2)
            );
            return distancia;
        }


    }

