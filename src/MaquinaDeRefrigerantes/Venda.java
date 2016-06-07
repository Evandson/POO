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
    public double ganhoVendas = 0;

    Sukita novaSukita = new Sukita();
    CocaCola novaCocaCola = new CocaCola();
    Sprite novaSprite = new Sprite();

    public void inserirMoedas(double troco){
        this.trocoTotal += troco;
    }

    public void verificarTroco(){
        System.out.println(this.trocoTotal);
    }

    public void novaVenda(int codigo, double dinheiro){
        switch(codigo){
            case 1:
                if((novaSukita.quantidade > 0) && ((dinheiro - novaSukita.valor) == 0)) {
                    novaSukita.quantidade--;
                    vendaSukita++;
                    ganhoVendas += dinheiro;
                    System.out.println("Pegue o Refrigerante!");
                }
                else if((novaSukita.quantidade > 0) && ((dinheiro - novaSukita.valor) > 0) && (trocoTotal >= dinheiro - novaSukita.valor)){
                    novaSukita.quantidade--;
                    vendaSukita++;
                    ganhoVendas += dinheiro;
                    trocoCliente = (dinheiro - novaSukita.valor);
                    trocoTotal -= trocoCliente;
                    System.out.println("Pegue o Refrigerante! Troco: "+trocoCliente);
                }
                else if (novaSukita.quantidade == 0){
                    System.out.println("Produto Indisponível!");
                }
                else if (dinheiro < novaSukita.valor){
                    System.out.println("Valor Insuficiente para compra");
                }
                else if ((novaSukita.quantidade > 0) && ((dinheiro - novaSukita.valor) > 0) && (trocoTotal < dinheiro - novaSukita.valor)){
                    novaSukita.quantidade--;
                    vendaSukita++;
                    ganhoVendas += dinheiro;
                    System.out.println("Pegue o Refrigerante. Infelizmente faltou troco!");
                }
                break;
        }

    }

}
