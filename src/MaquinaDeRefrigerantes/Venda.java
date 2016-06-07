package MaquinaDeRefrigerantes;

/**
 * Created by Evandson on 06/06/2016.
 */
public class Venda {
    public static int vendaSukita;
    public static int vendaCocaCola;
    public static int vendaSprite;

    private double trocoTotal = 125.50;
    private double trocoCliente = 0;
    private double ganhoVendas = 0;

    Sukita novaSukita = new Sukita();
    CocaCola novaCocaCola = new CocaCola();
    Sprite novaSprite = new Sprite();

    public double getTrocoTotal() {
        return trocoTotal;
    }

    public void setTrocoTotal(double trocoTotal) {
        this.trocoTotal = trocoTotal;
    }

    public double getGanhoVendas() {
        return ganhoVendas;
    }

    public void setGanhoVendas(double ganhoVendas) {
        this.ganhoVendas = ganhoVendas;
    }

    public void inserirMoedas(double troco){
        this.trocoTotal += troco;
    }

    public void novaVenda(int codigo, double dinheiro){
        switch(codigo){
            case 1:
                if((novaSukita.getQuantidade() > 0) && ((dinheiro - novaSukita.getValor()) == 0)) {
                    vendaSukita++;
                    ganhoVendas += dinheiro;
                    novaSukita.setQuantidade(-1);
                    System.out.println("Pegue o Refrigerante!");
                }
                else if((novaSukita.getQuantidade() > 0) && ((dinheiro - novaSukita.getValor()) > 0) &&
                        (trocoTotal >= dinheiro - novaSukita.getValor())){
                    vendaSukita++;
                    ganhoVendas += dinheiro;
                    trocoCliente = (dinheiro - novaSukita.getValor());
                    trocoTotal -= trocoCliente;
                    System.out.println("Pegue o Refrigerante! Troco: "+trocoCliente);
                }
                else if (novaSukita.getQuantidade() == 0){
                    System.out.println("Produto Indisponível!");
                }
                else if (dinheiro < novaSukita.getValor()){
                    System.out.println("Valor Insuficiente para compra");
                }
                else if ((novaSukita.getQuantidade() > 0) && ((dinheiro - novaSukita.getValor()) > 0) &&
                        (trocoTotal < dinheiro - novaSukita.getValor())){
                    vendaSukita++;
                    ganhoVendas += dinheiro;
                    System.out.println("Pegue o Refrigerante. Infelizmente faltou troco!");
                }
                break;
        }

    }

}
