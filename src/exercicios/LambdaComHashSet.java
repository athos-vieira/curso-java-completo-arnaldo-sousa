import java.util.*;

public class LambdaComHashSet {
    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);

        numeros.removeIf( n -> n % 2 == 0);
        System.out.println("Numeros ímpares:" + numeros);
    }
}       