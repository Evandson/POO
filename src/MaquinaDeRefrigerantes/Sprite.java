package MaquinaDeRefrigerantes;

/**
 * Created by Evandson on 06/06/2016.
 */
public class Sprite implements ControleEstoque {
    private int quantidade = 5;
    private double valor = 2.50;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void consultarEstoque() {
        System.out.println(getQuantidade());
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