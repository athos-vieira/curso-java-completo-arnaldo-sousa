package ListaDeCompras;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArquivoService {

    public static void exportar(ArrayList<Item> itens) {

        if (itens.isEmpty()) {

            System.out.println("Lista vazia!");

            return;
        }

        try {

            // cria conexao com arquivo txt
            BufferedWriter writer =
                    new BufferedWriter(
                            new FileWriter("listaDeCompras.txt")
                    );

            // Percorre lista
            for (Item item : itens) {

                writer.write(item.toString());

                writer.newLine();

            }

            writer.close();

            System.out.println("Lista exportada com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao exportar arquivo!");

        }

    }
}