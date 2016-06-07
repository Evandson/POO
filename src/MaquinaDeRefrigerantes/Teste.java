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
                    System.out.println("Sukita(1) \n Coca Cola(2) \n Sprite(3)");
                    int produto = sc.nextInt();
                    vendaRefri.novaVenda(produto, dinheiro);
                    if (produto == 1 && s.getQuantidade() > 0){
                        Sukita.retirarRefrigerante();
                    }else if(produto == 2 && c.getQuantidade() > 0){
                        CocaCola.retirarRefrigerante();
                    }else if(produto == 3 && p.getQuantidade() > 0){
                        Sprite.retirarRefrigerante();
                    }
                    break;
                case 2:
                    System.out.println("Inserir Produto(1) \n Inserir Moedas para troco(2) \n Histórico de vendas(3) \n " +
                            "Quantidade de dinheiro na maquina(4) \n Estoque de produtos(5)");
                    int funcao = sc.nextInt();
                    if(funcao == 1){
                        System.out.println("Quantidade de Sukita:");
                        Sukita.consultarEstoque();
                        System.out.println("Inserir Sukita:");
                        int qtdSukita = sc.nextInt();
                        Sukita.inserirRefrigerante(qtdSukita);
                        System.out.println("Nova quantidade:");
                        Sukita.consultarEstoque();

                        System.out.println("Quantidade de Coca Cola:");
                        CocaCola.consultarEstoque();
                        System.out.println("Inserir Coca Cola:");
                        int qtdCocaCola = sc.nextInt();
                        CocaCola.inserirRefrigerante(qtdCocaCola);
                        System.out.println("Nova quantidade:");
                        CocaCola.consultarEstoque();

                        System.out.println("Quantidade de Sprite:");
                        Sprite.consultarEstoque();
                        System.out.println("Inserir Sprite:");
                        int qtdSprite = sc.nextInt();
                        Sprite.inserirRefrigerante(qtdSprite);
                        System.out.println("Nova quantidade:");
                        Sprite.consultarEstoque();
                    }
                    else if(funcao == 2){

                        System.out.println("Quantidade de Moedas para troco no momento:");
                        vendaRefri.getTrocoTotal();
                        System.out.println("Adicionar Moedas:");
                        double moeda = sc.nextInt();
                        vendaRefri.inserirMoedas(moeda);
                        System.out.println("Novo valor para troco:");
                        vendaRefri.getTrocoTotal();
                    }
                    else if(funcao == 3){
                        System.out.println("Histórico das Vendas..");
                        System.out.println("Sukita: "+Venda.vendaSukita);
                        System.out.println("Coca Cola: "+Venda.vendaCocaCola);
                        System.out.println("Sprite: "+Venda.vendaSprite);
                    }
                    else if(funcao == 4){
                        System.out.println("Caixa da Maquina..");
                        System.out.println("Dinheiro de vendas:");
                        vendaRefri.getGanhoVendas();
                        System.out.println("Dinheiro para troco:");
                        vendaRefri.getTrocoTotal();
                    }
                    else if(funcao == 5){
                        System.out.println("Estoque de Produtos..");
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
                System.out.println("Obrigado!");
                    loop = false;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Desculpe, pedido inexistente!");
            }
        }
    }
    public static void menu() {
        System.out.println("Comprar Refrigerante(1) \n Painel Usuário(2) \n Sair(3)");
    }
}