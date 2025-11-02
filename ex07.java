public class Exercicio07 {
    public static void main(String[] args) {
        int[] A = {2, 3, 4, 7, 8, 10, 13, 16, 18, 21};
        int contador = 0;

        for (int valor : A) {
            if (valor % 2 == 0) contador++;
        }

        System.out.println("Quantidade de números pares: " + contador);
    }
}
