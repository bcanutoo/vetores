public class Exercicio04 {
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }

        System.out.print("Vetor B: ");
        for (int valor : B) System.out.print(valor + " ");
    }
}
