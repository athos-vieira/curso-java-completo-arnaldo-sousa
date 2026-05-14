package ListaDeCompras;



import java.util.ArrayList;

public class ListaService {


    private ArrayList<Item> itens;


    public ListaService() {

        itens = new ArrayList<>();

    }

    public void adicionarItem(Item item) {

        // Valida nome vazio
        if (item.getNome().trim().isEmpty()) {

            System.out.println("Nome inválido!");

            return;
        }

        itens.add(item);
        System.out.println("Item adicionado com sucesso!");

    }

    public void listarItens() {

        if (itens.isEmpty()) {

            System.out.println("A lista está vazia!");

            return;
        }

        System.out.println("\n======= ITENS DA LISTA =======");

        // percorre lista
        for (int i = 0; i < itens.size(); i++) {

            // indice + item
            System.out.println((i + 1) + " - " + itens.get(i));

        }

    }


    public void removerItem(int indice) {


        // Verifica se índice existe
        if (indice < 0 || indice >= itens.size()) {

            System.out.println("Item inválido!");

            return;
        }

        Item itemRemovido = itens.get(indice);
        itens.remove(indice);

        System.out.println("Item removido:" + itemRemovido);

    }

    // Getter da lista
    public ArrayList<Item> getItens() {

        return itens;

    }
}