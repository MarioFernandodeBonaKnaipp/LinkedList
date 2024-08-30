package LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList dList = new LinkedList();

        while (true) {
            System.out.println("\n Escolha uma operação:");
            System.out.println("1. Insira um item");
            System.out.println("2. Insira um item por index");
            System.out.println("3. Remova um item");
            System.out.println("4. Limpe a fila");
            System.out.println("5. Mostrar a fila");
            System.out.println("6. Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Escreva o item para inserir: ");
                    int item = scanner.nextInt();
                    dList.add(item);
                    break;
                case 2:
                    System.out.print("Escreva o item para inserir: ");
                    int indexItem = scanner.nextInt();
                    System.out.print("Escreva o index para inserir: ");
                    int indexAdd = scanner.nextInt();
                    dList.addIndex(indexAdd, indexItem);
                    break;
                case 3:
                    System.out.print("Escreva o index para remover: ");
                    int indexRemov = scanner.nextInt();
                    dList.removeIndex(indexRemov);
                    break;
                case 4:
                    dList.limparLista();
                    break;
                case 5:
                    dList.display();
                    break;
                case 6:
                    System.out.print("Saindo...... ");
                    return;
                default:
                    System.out.print("Opção inválida... Tente novamente! \n");
                    break;
            }
        }
    }
}