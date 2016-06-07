package MaquinaDeRefrigerantes;

/**
 * Created by Evandson on 06/06/2016.
 */
public class CocaCola implements ControleEstoque {
    int quantidade = 15;
    double valor = 3.50;

    @Override
    public void consultarEstoque() {
        System.out.println(this.quantidade);
    }

    @Override
    public void inserirRefrigerante(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void retirarRefrigerante(){
        this.quantidade--;
    }
}
