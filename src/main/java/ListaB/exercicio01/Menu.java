package ListaB.exercicio01;

import java.util.Scanner;

public class Menu {
    private GerenciarProdutos gerenciarProdutos = new GerenciarProdutos();
    public void exibirMenu(){
        System.out.println("------------------------ MENU ------------------------");
        System.out.println("1 - Exibir produtos");
        System.out.println("2 - Cadastrar novo produto");
        System.out.println("3 - Excluir produto");
        System.out.println("0 - Sair");
        System.out.println("------------------------------------------------------");
    }

    public void selecionarOpcao(int opcao){
        Scanner in = new Scanner(System.in);
        String nome;
        double preco;
        switch (opcao){
            case 1:
                System.out.println("----------------------- PRODUTOS -----------------------");
                gerenciarProdutos.exibirProdutos();
                System.out.println("--------------------------------------------------------");
                break;
            case 2:
                System.out.println("Digite o nome do novo produto: ");
                nome = in.nextLine();
                System.out.println("Digite quanto custa " + nome);
                preco = in.nextDouble();
                in.nextLine();
                gerenciarProdutos.adicionarProduto(nome,preco);
                System.out.println("Produto adicionado com sucesso!");
                break;
            case 3:
                System.out.println("Digite o nome do produto que deseja excluir: ");
                nome = in.nextLine();
                gerenciarProdutos.excluirProduto(nome);
                break;
            case 0:
                System.out.println("Volte sempre!");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }


}
