import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class ManipulacaoArquivos {
    public static void main(String[] args) {
        String nomeArquivo = "meuarquivo.txt";
        String conteudo = "Olá, mundo!";

        escreverNoArquivo(nomeArquivo, conteudo);

        String conteudoLido = lerDoArquivo(nomeArquivo);
        System.out.println("Conteúdo lido do arquivo: " +
                conteudoLido);
    }
    public static void escreverNoArquivo(String nomeArquivo, String conteudo) {
        try {
            FileWriter writer = new FileWriter(nomeArquivo);
            writer.write(conteudo);
            writer.close();
            System.out.println("Arquivo criado e texto escrito com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " +
                    e.getMessage());
        }
    }
    public static String lerDoArquivo(String nomeArquivo) {
        StringBuilder conteudo = new StringBuilder();
        try {
            FileReader reader = new FileReader(nomeArquivo);
            int caractere;
            while ((caractere = reader.read()) != -1) {
                conteudo.append((char) caractere);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " +
                    e.getMessage());
        }
        return conteudo.toString();
    }
}

