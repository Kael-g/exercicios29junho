package ListaB.exercicio01;

import java.util.HashMap;

public class Produtos {
    private HashMap<String, Double> produtos;

    public Produtos() {
        produtos = new HashMap<>();
    }

    public HashMap<String, Double> getProdutos() {
        return produtos;
    }

    public void add(String nome, double preco) {
        this.produtos.put(nome,preco);
    }

    public void del(String name){
        produtos.remove(name);
    }
}
