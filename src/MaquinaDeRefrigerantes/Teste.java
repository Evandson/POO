package MaquinaDeRefrigerantes;

import java.util.Scanner;

/**
 * Created by Evandson on 06/06/2016.
 */
public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControleEstoque Sukita = new Sukita();
        ControleEstoque CocaCola = new CocaCola();
        ControleEstoque Sprite = new Sprite();

        int a;
        System.out.println("Adicionar Refrigerante:");
        a = sc.nextInt();
        Sukita.inserirRefrigerante(a);
        Sukita.consultarEstoque();

        //CocaCola.consultarEstoque();
        //Sprite.consultarEstoque();

        Venda vendaRefri = new Venda();

        double b;
        System.out.println("Inserir Moeda para troco:");
        b = sc.nextDouble();
        vendaRefri.inserirMoedas(b);
        vendaRefri.verificarTroco();

        int c;
        double d;
        vendaRefri.novaVenda(1,200);
        System.out.println("Nova quantidade de Sukita");
        Sukita.consultarEstoque();
        vendaRefri.verificarTroco();
        System.out.println("Vendidas:"+Venda.vendaSukita);
        System.out.println(vendaRefri.ganhoVendas);
    }
}
