package MaquinaDeRefrigerantes;

/**
 * Created by Evandson on 06/06/2016.
 */
public class Venda {
    public static int vendaSukita;
    public static int vendaCocaCola;
    public static int vendaSprite;

    private double trocoTotal = 5.50;
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
    public void verificarTroco(){
        System.out.println(this.trocoTotal);
    }

    public void verificaGanhoVendas(){
        System.out.println(this.ganhoVendas);
    }

    private void compraSemTroco(int codigo, double dinheiro){
        switch(codigo){
            case 1:
                vendaSukita++;
                ganhoVendas += dinheiro;
                System.out.println("Pegue sua Sukita!");
                break;
            case 2:
                vendaCocaCola++;
                ganhoVendas += dinheiro;
                System.out.println("Pegue sua Coca Cola!");
                break;
            case 3:
                vendaSprite++;
                ganhoVendas += dinheiro;
                System.out.println("Pegue sua Sprite");
                break;
        }
    }

    private void compraComTroco(int codigo, double dinheiro){
        switch(codigo){
            case 1:
                vendaSukita++;
                ganhoVendas += dinheiro;
                trocoCliente = (dinheiro - novaSukita.getValor());
                trocoTotal -= trocoCliente;
                System.out.println("Pegue o Refrigerante! Troco: "+trocoCliente);
                break;
            case 2:
                vendaCocaCola++;
                ganhoVendas += dinheiro;
                trocoCliente = (dinheiro - novaCocaCola.getValor());
                trocoTotal -= trocoCliente;
                System.out.println("Pegue o Refrigerante! Troco: "+trocoCliente);
                break;
            case 3:
                vendaSprite++;
                ganhoVendas += dinheiro;
                trocoCliente = (dinheiro - novaSprite.getValor());
                trocoTotal -= trocoCliente;
                System.out.println("Pegue o Refrigerante! Troco: "+trocoCliente);
                break;
        }
    }

    private void entregarSemTroco(int codigo, double dinheiro){
        switch(codigo){
            case 1:
                vendaSukita++;
                ganhoVendas += dinheiro;
                System.out.println("Pegue o Refrigerante. Infelizmente faltou troco!");
                break;
            case 2:
                vendaCocaCola++;
                ganhoVendas += dinheiro;
                System.out.println("Pegue o Refrigerante. Infelizmente faltou troco!");
                break;
            case 3:
                vendaSprite++;
                ganhoVendas += dinheiro;
                System.out.println("Pegue o Refrigerante. Infelizmente faltou troco!");
                break;
        }
    }

    public void novaVenda(int codigo, double dinheiro){
        switch(codigo){
            case 1:
                if((novaSukita.getQuantidade() >= 1) && ((dinheiro - novaSukita.getValor()) == 0)) {
                    compraSemTroco(codigo, dinheiro);
                }
                else if((novaSukita.getQuantidade() >= 1) && ((dinheiro - novaSukita.getValor()) > 0) &&
                        (trocoTotal >= dinheiro - novaSukita.getValor())){
                    compraComTroco(codigo, dinheiro);
                }
                else if (novaSukita.getQuantidade() == 0){
                    System.out.println("Sukita está indisponível no momento!");
                }
                else if (dinheiro < novaSukita.getValor()){
                    System.out.println("Valor Insuficiente para compra");
                }
                else if ((novaSukita.getQuantidade() >= 1) && ((dinheiro - novaSukita.getValor()) > 0) &&
                        (trocoTotal < dinheiro - novaSukita.getValor())){
                    entregarSemTroco(codigo, dinheiro);
                }
                break;
            case 2:
                if((novaCocaCola.getQuantidade() >= 1) && ((dinheiro - novaCocaCola.getValor()) == 0)) {
                    compraSemTroco(codigo, dinheiro);
                }
                else if((novaCocaCola.getQuantidade() >= 1) && ((dinheiro - novaCocaCola.getValor()) > 0) &&
                        (trocoTotal >= dinheiro - novaCocaCola.getValor())){
                    compraComTroco(codigo, dinheiro);
                }
                else if (novaCocaCola.getQuantidade() == 0){
                    System.out.println("Coca Cola está indisponível no momento!");
                }
                else if (dinheiro < novaCocaCola.getValor()){
                    System.out.println("Valor Insuficiente para compra!");

                }
                else if ((novaCocaCola.getQuantidade() >= 1) && ((dinheiro - novaCocaCola.getValor()) > 0) &&
                        (trocoTotal < dinheiro - novaCocaCola.getValor())){
                    entregarSemTroco(codigo, dinheiro);
                }
                break;
            case 3:
                if (novaSprite.getQuantidade() == 0){
                    System.out.println("Sprite está indisponível no momento!");
                    break;
                }
                else if((novaSprite.getQuantidade() > 0) && ((dinheiro - novaSprite.getValor()) == 0)) {
                    compraSemTroco(codigo, dinheiro);
                }
                else if((novaSprite.getQuantidade() > 0) && ((dinheiro - novaSprite.getValor()) > 0) &&
                        (trocoTotal >= (dinheiro - novaSprite.getValor()))) {
                    compraComTroco(codigo, dinheiro);
                }
                else if (dinheiro < novaSprite.getValor()){
                    System.out.println("Valor Insuficiente para compra!");
                }
                else if ((novaSprite.getQuantidade() > 0) && ((dinheiro - novaSprite.getValor()) > 0) &&
                        (trocoTotal < dinheiro - novaSprite.getValor())){
                    entregarSemTroco(codigo, dinheiro);
                }
                break;
        }
    }
}