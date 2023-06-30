package ListaB.exercicio01;

import java.text.DecimalFormat;

public class GerenciarProdutos {
    private Produtos produtos = new Produtos();

    public void exibirProdutos(){
        DecimalFormat df = new DecimalFormat("#,##0.00");

        for (String nome : produtos.getProdutos().keySet()){
            double valor = produtos.getProdutos().get(nome);
            System.out.printf("%-30s R$ %s\n", nome, df.format(valor));
        }
    }
    public void adicionarProduto(String nome, double preco){
        produtos.add(nome,preco);
    }

    public void excluirProduto(String nome){
        produtos.del(nome);
    }
}
