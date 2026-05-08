package ListaDeCompras;

import java.util.*;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ListaDeCompras lista = new ListaDeCompras();

        int opcao;


        // loop principal
        // o menu aparece ate o usuario escolher a opcao de sair

        do {

            System.out.println("\n-------ESCOLHA UMA OPÇÃO------- ");
            System.out.println("1 - adicionar item ");
            System.out.println("2 - listar itens ");
            System.out.println("3 - exportar pedido ");
            System.out.println("4 - sair ");


            if (scanner.hasNextInt()) {

                opcao = scanner.nextInt();
                scanner.nextLine();

            } else {

                System.out.println("Digite apenas números!");

                scanner.nextLine();

                opcao = 0;
            }


            // decidir o que fazer com base na opçao escoliha

            switch (opcao) {
                case 1:

                    System.out.println("Digite o nome do item: ");

                    String item = scanner.nextLine();

                    lista.adicionarItem(item);


                    break;


                case 2:

                    lista.listarItens();

                    break;


                case 3:

                    ExportadorLista.exportar(lista.getItens());

                    break;


                case 4:

                    System.out.println("encerrando sistema");

                    break;


                default:

                    System.out.println("opção inválida");


            }

        } while (opcao != 4);


        scanner.close();


    }

}
