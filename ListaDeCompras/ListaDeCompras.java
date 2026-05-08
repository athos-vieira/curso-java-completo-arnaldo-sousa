package ListaDeCompras;

import java.util.*;


public class ListaDeCompras {

    private ArrayList<String> itens;

    public ListaDeCompras() {

        itens = new ArrayList<>();

    }

    public void adicionarItem(String item) {

        if (item.isEmpty()) {
            System.out.println("Item inválido");

            return;

        }
        itens.add(item);
        System.out.println("Item adicionado com sucesso");

    }

    public void listarItens() {

        if (itens.isEmpty()) {
            System.out.println("A lista está vazia");

            return;

        }

        System.out.println("\n---- ITENS DA LISTA ----");

        // pecorro toda a lista e exibo a posiçao + string do item
        for (int i = 0; i < itens.size(); i++) {
            System.out.println((i + 1) + " - " + itens.get(i));

        }
    }


    public ArrayList<String> getItens() {
        return itens;
    }
}

