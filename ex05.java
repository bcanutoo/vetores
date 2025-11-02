public class Exercicio05 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.print("Vetor C (soma): ");
        for (int valor : C) System.out.print(valor + " ");
    }
}
