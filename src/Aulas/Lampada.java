package Aulas;

/**
 * Created by Evandson Maranhão on 09/05/2016.
 */
public class Lampada {
        public boolean estado;

        public Lampada(){}

        public void ligar(){
            estado = true;
        }
        public void desligar (){
            estado = false;
        }

        public void mostrar(){
            if (estado){
                System.out.println("a lampada esta ligada");
            } else {
                System.out.println("a lampada nao esta ligada");
            }
        }
}


