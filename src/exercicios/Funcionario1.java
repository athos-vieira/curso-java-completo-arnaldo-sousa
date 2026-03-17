package exercicios;

public class Funcionario1 {
    private String nome;
    private int idade1;
    private double[] salario = new double[]{3000.0, 5000.0, 7500.0};
    private double soma = 0;
    public void imprimirDados(String str, int idade, double[] salario) {

        this.nome = str;
        this.idade1 = idade;
        this.salario = salario;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        /* loop para printar meus salários em ordem crescente dos indices e especificamente
           começando do valor 1 até o 3 (i + 1);
         */

        for (int i = 0; i < salario.length; i++) {

            System.out.println("Salário" + (i + 1) +":" + salario[i]);
        }
    }


    /* o double arr que passo aqui é só pra exemplificar o comportamento desse
       método com um array qualquer.Quando eu chamar esse método no meu void main,
       o meu double[] salario vai se comportar da mesma forma especificada;
     */

    static double mediaSalarios (double[] arr) {
        if (arr.length == 0) {
            return  0;
        }
        // loop para calcular a média dos salários.
        double soma = 0;
        for (double i : arr) {
            soma += i;
        }
        return soma / arr.length;
    }


    public static void main(String[] args) {
        Funcionario1 funcionario1 = new Funcionario1();
        funcionario1.imprimirDados("Athos", 35, funcionario1.salario );

        // %.2f%n = atalho usado para definir o número de casas decimais
        System.out.printf("Média dos salários: %.2f%n", mediaSalarios(funcionario1.salario));

    }
}

