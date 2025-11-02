public class Exercicio10 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int cont0 = 0, cont1 = 0;

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.round(Math.random());
            if (A[i] == 0) cont0++;
            else cont1++;
        }

        double perc0 = (cont0 * 100.0) / A.length;
        double perc1 = (cont1 * 100.0) / A.length;

        System.out.print("Vetor A: ");
        for (int valor : A) System.out.print(valor + " ");

        System.out.printf("\nPercentual de 0's: %.1f%%", perc0);
        System.out.printf("\nPercentual de 1's: %.1f%%", perc1);
    }
}
