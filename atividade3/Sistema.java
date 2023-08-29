package atividade3;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {

        int opcao = 0;
        Estoque estoque = new Estoque();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n=============MENU=============");
            System.out.println("1 - ADICIONAR ITEM");
            System.out.println("2 - LISTAR ITENS");
            System.out.println("3 - BUSCAR ITEM");
            System.out.println("4 - SAIR\n");
            System.out.print("> ");
            opcao = scanner.nextInt();
            executarOpcao(opcao, scanner, estoque);
        } while (opcao != 4);
        
        scanner.close();
        System.out.println("Sistema fechado.");
    }

    public static void executarOpcao(int op, Scanner sc, Estoque estoque) {
        switch (op) {
            case 1:
                System.out.println("\tADICIONANDO ITEM");
                sc.nextLine(); // Limpar o buffer
                System.out.print("Digite o nome do item: ");
                String nome = sc.nextLine();
                System.out.print("Digite a quantidade: ");
                int quantidade = sc.nextInt();

                ItemEstoque item = new ItemEstoque(nome, quantidade);
                estoque.adicionarItem(item);
                break;

            case 2:
                System.out.println("\n\tLISTANDO ITENS");
                System.out.println(estoque.listarItens());
                break;

            case 3:
                System.out.println("\n\tBUSCANDO ITEM");
                sc.nextLine(); // Limpar o buffer
                System.out.print("Buscar item por nome: ");
                String nomeBusca = sc.nextLine();

                System.out.println(estoque.buscarItemPorNome(nomeBusca));
                break;
        }
    }
}