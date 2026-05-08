package ListaDeCompras;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorLista {

    //metodo static responsavel por exportar os itens para um arquivo txt
    public static void exportar(ArrayList<String> itens) {

        if (itens.isEmpty()) {
            System.out.println("A lista está vazia.");

            return;
        }


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("listaDeCompras.txt"));

            for (String item : itens) {

                //escreve o item no arquivo
                writer.write(item);

                //quebra linha
                writer.newLine();

            }

            //
            writer.close();
            System.out.println("Lista exportada com sucesso");


         } catch (IOException e) {
            System.out.println("Erro ao exportar arquivo");


        }
    }
}
