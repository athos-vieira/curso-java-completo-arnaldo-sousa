import java.security.SecureRandom;
import java.util.*;


public class geradorDeSenhas {

        // banco de strings e simbolos disponiveis para a senha, com estado final para denotar a caracteristica imutavel dessa variavel
        private static final String CARACTERES = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*()_+-=[]|,./?><";


        // metodo que gera a senha aleatoria de acordo com o comprimento digitado pelo usuario
        public static String gerarSenha (int comprimento) {
            SecureRandom geradorNumeroAleatorio = new SecureRandom();
            StringBuilder senha = new StringBuilder();

            for (int  i = 0; i < comprimento; i++) {

                //gera caracter aleatorio de acordo com algum indice da String final e adiciona esse caracter ao final da senha
                int indice = geradorNumeroAleatorio.nextInt(CARACTERES.length());
                senha.append(CARACTERES.charAt(indice));

            }

            // converter StringBuilder em String para ficar de acordo com a assinatura do metodo
            return senha.toString();

        }


        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Digite o comprimento desejado para sua senha: ");
           int comprimentoSenha = scanner.nextInt();



        String senha = gerarSenha(comprimentoSenha);
        System.out.println("Sua senha é: " + senha);

    }
}
