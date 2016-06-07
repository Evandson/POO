package MaquinaDeRefrigerantes;

/**
 * Created by Evandson on 06/06/2016.
 */
public class CocaCola implements ControleEstoque {
    private int quantidade = 15;
    private double valor = 3.50;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
