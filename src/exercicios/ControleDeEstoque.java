import java.util.*;

public class ControleDeEstoque {

    public static void main(String[] args) {

        Map<Integer, Integer> estoque = new HashMap<>();

        estoque.put(123, 10);
        estoque.put(213, 15);
        estoque.put(321, 20);

        //checando a quantidade do produto 1,

        int codPruduto1 = 123;
        int qtdProduto1 = estoque.get(codPruduto1);

        System.out.println("Quantidade do produto" + codPruduto1 +":" + qtdProduto1);

        // removendo uma quantidade do produto 1

        int qtdRemovida1 = 11;


        if (qtdProduto1 >= qtdRemovida1) {
            estoque.put(codPruduto1, qtdProduto1 - qtdRemovida1);
            System.out.println("quantidade do produto" + codPruduto1 + "após a remoção: " + (qtdProduto1 - qtdRemovida1));

            } else {
            System.out.println("Quantidade isuficiente para remoção.");
        }
    }
}
