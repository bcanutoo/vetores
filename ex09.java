import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação atual do dólar (R$): ");
        double cotacao = sc.nextDouble();

        double[] conversoes = new double[20];

        for (int i = 0; i < conversoes.length; i++) {
            conversoes[i] = cotacao * (i + 1);
        }

        System.out.println("\nConversões:");
        for (int i = 0; i < conversoes.length; i++) {
            System.out.printf("%2d dólar(es) = R$ %.2f%n", (i + 1), conversoes[i]);
        }

        sc.close();
    }
}
