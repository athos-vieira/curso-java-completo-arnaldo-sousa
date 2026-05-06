package projeto_calculadora_imc;

import java.util.*;

public class CalculadoraIMC {
    public static void main(String[] args) {

        // Criar Scanner para receber as estradas do usuário
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        double altura = 0;
        double peso = 0;


        // inicia exceção caso alguma entrada não siga o tipo primitivo correspondente
        try {

            System.out.print("Digite seu nome:");
            nome = scanner.nextLine();

            System.out.print("Digite sua idade:");
            idade = scanner.nextInt();

            System.out.print("Digite sua altura (ex: 1,75): ");
            altura = scanner.nextDouble();

            System.out.print("Digite seu peso:");
            peso = scanner.nextDouble();

            // captura o erro de tipo errado, fecha o scanner para o programa
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você digitou um valor errado");
            scanner.close();
            return;

        }

        // Validacao das entradas
        if (altura <= 0 || peso <= 0) {
            System.out.println("Erro: altura e peso precisam ser maiores que 0");
            scanner.close();
            return;

        }


        // Cálculo
        double imc = calcularIMC(peso, altura);

        // Classificação
        String classificacao = classificarIMC(imc);

        scanner.close();


        // Resultado dos inputs depois de validar
        System.out.println("\n-------Resultados-------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.printf("IMC: %.2f\n ", imc);
        System.out.println("Classificação: " + classificacao);

        
    }


    // metodo para calcular imc
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);

    }

    // metodo para classificar o usuario
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";

        } else if (imc < 25) {
            return "Peso normal";

        } else if (imc < 30) {
            return "Sobre peso";

        } else {
            return "Obsidade";

        }
    }
}




