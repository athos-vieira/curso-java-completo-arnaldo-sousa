import java.util.*;


public class Main {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        ListaCompras lista = new ListaCompras();

        int opcao;


        // loop principal
        // o menu aparece ate o usuario escolher a opcao de sair 

        do {

        System.out.println ("\n-------ESCOLHA UMA OPÇÃO------- ");
        System.out.println ("1 - adicionar item ");
        System.out.println ("2 - listar itens ");
        System.out.println ("3 - exportar pedido ");
        System.out.println ("4 - sair ");
       

        opcao = scanner.nextInt();


        // limpa o enter da fila do scanner para evitar ler uma opçao vazia
        scanner.nextLine();


        
        
        // decidir o que fazer com base na opçao escoliha
        
        switch (opcao) {
            case 1:

                System.out.println("Digite o nome do item: ");

                String item = scanner.nextLine();

                lista.adicionarItem(item);


                break;
        


            case 2:

                lista.listarItens;

                break;




            case 3:

                ExportadorLista.exportar(lista.getItens())

                break;





            case 4:

                System.out.println("encerrando sistema");

                break;

            
            default:
                
                System.out.println("opção inválida");

                
        }
    }



       
    }
    
}
