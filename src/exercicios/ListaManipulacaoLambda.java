import java.util.*;


public class ListaManipulacaoLambda {
    public static void main(String[] args) {

        List <String> minhaLista = new ArrayList<>();
        minhaLista.add("banana");
        minhaLista.add("maçã");
        minhaLista.add("cereja");
        minhaLista.add("abacaxi");

        minhaLista.removeIf(s -> s.length() > 5);

        minhaLista.add(0, "Uva");

        minhaLista.forEach(System.out::println);
    }
}
