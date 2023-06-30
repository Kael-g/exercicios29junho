package ListaB.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;
        do {
            menu.exibirMenu();
            opcao = in.nextInt();
            in.nextLine();
            menu.selecionarOpcao(opcao);
        } while (opcao!=0);
    }
}
