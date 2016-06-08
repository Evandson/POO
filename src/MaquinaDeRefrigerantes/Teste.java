package MaquinaDeRefrigerantes;

import java.util.Scanner;

/**
 * Created by Evandson on 06/06/2016.
 */
public class Teste {

    public static void main(String[] args) {

        ControleEstoque Sukita = new Sukita();
        ControleEstoque CocaCola = new CocaCola();
        ControleEstoque Sprite = new Sprite();
        Venda vendaRefri = new Venda();
        Sukita s = new Sukita();
        CocaCola c = new CocaCola();
        Sprite p = new Sprite();

        boolean loop = true;
        int opcao = -1;
        System.out.println("Maquina de Refrigerantes!");
        System.out.println();

        while (loop) {

            menu();

            Scanner sc = new Scanner(System.in);
            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Insira o dinheiro:");
                    double dinheiro = sc.nextDouble();
                    System.out.println("Sukita(1) \nCoca Cola(2) \nSprite(3)");
                    int produto = sc.nextInt();
                    vendaRefri.novaVenda(produto, dinheiro);
                    if ((produto == 1) && (s.getQuantidade() > 0) && (dinheiro >= s.getValor())){
                        Sukita.retirarRefrigerante();
                    }else if((produto == 2) && (c.getQuantidade() > 0) && (dinheiro >= c.getValor())){
                        CocaCola.retirarRefrigerante();
                    }else if((produto == 3) && (p.getQuantidade() > 0) && (dinheiro >= p.getValor())){
                        Sprite.retirarRefrigerante();
                    }
                    break;
                case 2:
                    System.out.println("Inserir Produto(1) \nInserir Moedas para troco(2) \nHistórico de vendas(3) \n"+
                            "Quantidade de dinheiro na maquina(4) \nEstoque de produtos(5)");
                    System.out.println();
                    int funcao = sc.nextInt();
                    if(funcao == 1){
                        System.out.println("INSERIR PRODUTOS...");
                        System.out.println();
                        System.out.println("Quantidade de Sukita:");
                        Sukita.consultarEstoque();
                        System.out.println("Inserir Sukita:");
                        int qtdSukita = sc.nextInt();
                        Sukita.inserirRefrigerante(qtdSukita);
                        System.out.println("Nova quantidade:");
                        Sukita.consultarEstoque();
                        System.out.println();

                        System.out.println("Quantidade de Coca Cola:");
                        CocaCola.consultarEstoque();
                        System.out.println("Inserir Coca Cola:");
                        int qtdCocaCola = sc.nextInt();
                        CocaCola.inserirRefrigerante(qtdCocaCola);
                        System.out.println("Nova quantidade:");
                        CocaCola.consultarEstoque();
                        System.out.println();

                        System.out.println("Quantidade de Sprite:");
                        Sprite.consultarEstoque();
                        System.out.println("Inserir Sprite:");
                        int qtdSprite = sc.nextInt();
                        Sprite.inserirRefrigerante(qtdSprite);
                        System.out.println("Nova quantidade:");
                        Sprite.consultarEstoque();
                        System.out.println();
                    }
                    else if(funcao == 2){
                        System.out.println("INSERIR MODEDAS...");
                        System.out.println();
                        System.out.println("Quantidade de Moedas para troco no momento:");
                        vendaRefri.verificarTroco();
                        System.out.println("Adicionar Moedas:");
                        double moeda = sc.nextDouble();
                        vendaRefri.inserirMoedas(moeda);
                        System.out.println("Novo valor para troco:");
                        vendaRefri.verificarTroco();
                        System.out.println();
                    }
                    else if(funcao == 3){
                        System.out.println("HISTÓRICO DE VENDAS..");
                        System.out.println();
                        System.out.println("Sukita: "+Venda.vendaSukita);
                        System.out.println("Coca Cola: "+Venda.vendaCocaCola);
                        System.out.println("Sprite: "+Venda.vendaSprite);
                        System.out.println();
                    }
                    else if(funcao == 4){
                        System.out.println("CAIXA DA MAQUINA..");
                        System.out.println();
                        System.out.println("Dinheiro de vendas:");
                        vendaRefri.verificaGanhoVendas();
                        System.out.println("Dinheiro para troco:");
                        vendaRefri.verificarTroco();
                        System.out.println();
                    }
                    else if(funcao == 5){
                        System.out.println("ESTOQUE DE PRODUTOS..");
                        System.out.println();
                        System.out.println("Quantidade de Sukita:");
                        Sukita.consultarEstoque();
                        System.out.println("Quantidade de Coca Cola:");
                        CocaCola.consultarEstoque();
                        System.out.println("Quantidade de Sprite:");
                        Sprite.consultarEstoque();
                    }else{
                        System.out.println("Funcão Inexistente!!");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Obrigado!");
                    loop = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Desculpe, pedido inexistente!");
                    System.out.println();
            }
        }
    }
    public static void menu() {
        System.out.println("COMPRAR REFRIGERANTE(1) \nPAINEL USUÁRIO(2) \nSAIR(3)");
    }
}