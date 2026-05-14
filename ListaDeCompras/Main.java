package ListaDeCompras;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ListaService listaService = new ListaService();

        int opcao;

        do {

            System.out.println("\n======= ESCOLHA UMA OPÇÃO =======");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Remover item");
            System.out.println("4 - Exportar lista");
            System.out.println("5 - Sair");

            System.out.print("Digite uma opção: ");


            if (scanner.hasNextInt()) {

                opcao = scanner.nextInt();

                // consome o ENTER no buffer para evitar strings vazias
                scanner.nextLine();

            } else {

                System.out.println("Digite apenas números!");

                scanner.nextLine();

                // cai no default
                opcao = 0;
            }

            switch (opcao) {

                case 1:


                    String nome;

                    while (true) {

                        System.out.print("Nome: ");

                        nome = scanner.nextLine();

                        if (!nome.trim().isEmpty()) {

                            break;
                        }

                        System.out.println("Digite um nome válido!");

                    }


                    double preco;

                    while (true) {

                        System.out.print("Preço: ");

                        if (scanner.hasNextDouble()) {

                            preco = scanner.nextDouble();

                            scanner.nextLine();

                            break;
                        }

                        System.out.println("Digite um preço válido!");

                        scanner.nextLine();

                    }


                    int quantidade;

                    while (true) {

                        System.out.print("Quantidade: ");

                        if (scanner.hasNextInt()) {

                            quantidade = scanner.nextInt();

                            scanner.nextLine();

                            break;
                        }

                        System.out.println("Digite uma quantidade válida!");

                        scanner.nextLine();

                    }


                    Item item = new Item(nome, preco, quantidade);


                    listaService.adicionarItem(item);

                    break;

                case 2:


                    listaService.listarItens();

                    break;

                case 3:

                    listaService.listarItens();

                    System.out.print("Digite o número do item: ");

                    int indice = scanner.nextInt();

                    scanner.nextLine();

                    listaService.removerItem(indice - 1);

                    break;

                case 4:

                    ArquivoService.exportar(listaService.getItens());

                    break;

                case 5:

                    System.out.println("Encerrando sistema...");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 5);


        scanner.close();
    }
}