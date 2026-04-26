package exercicios;

@FunctionalInterface
interface OperacaoMatematica {
    double executar(double a, double b);
}

public class CalculadoraFuncional {
    static void main(String[] args) {

        OperacaoMatematica potencia = (a, b) -> Math.pow (a, b);
        System.out.println("Potência: " + potencia.executar(5, 10));

        OperacaoMatematica raizQuadrada = (a, b) -> Math.sqrt(a + b);
        System.out.println("Raiz quadrada da soma: " + raizQuadrada.executar(5, 10));


    }
}
    