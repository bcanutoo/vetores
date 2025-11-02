public class Exercicio01 {
    public static void main(String[] args) {
      
        int[] A = {10, 20, 30, 40, 50};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
      
        System.out.println("Vetor A:");
        for (int valor : A) {
            System.out.print(valor + " ");
        }

        System.out.println("\nVetor B (cópia de A):");
        for (int valor : B) {
            System.out.print(valor + " ");
        }
    }
}
