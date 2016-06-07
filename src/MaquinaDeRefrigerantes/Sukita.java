package MaquinaDeRefrigerantes;

/**
 * Created by Evandson on 06/06/2016.
 */
public class Sukita implements ControleEstoque {
    protected int quantidade = 10;
    double valor = 2.50;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

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
