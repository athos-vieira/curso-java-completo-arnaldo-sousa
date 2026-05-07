import java.util.*;

public class ListaFilmes {
    public static void main(String[] args) {

        List<String> filmes = new ArrayList<>();

        filmes.add("O poderoso chefão");
        filmes.add("Matrix");
        filmes.add("Interstellar");

        //printa a lista de filmes que estão dentro do ArrayList em ordem de indice
        System.out.println("Lista de filmes:");
        for (String filme : filmes) {
            System.out.println(filme);
        }

        String filmeBuscado = "Matrix";

        if (filmes.contains(filmeBuscado)){
            System.out.println(filmeBuscado + " está na lista");
        } else {
            System.out.println(filmeBuscado + " não está na lista!!");
        }
    }
}
