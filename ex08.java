import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] media = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Aluno " + (i + 1) + " - Nota 1: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Aluno " + (i + 1) + " - Nota 2: ");
            nota2[i] = sc.nextDouble();

            media[i] = (nota1[i] + nota2[i]) / 2;
        }

        System.out.println("\nResultado final:");
        for (int i = 0; i < 10; i++) {
            String situacao = media[i] >= 7 ? "Aprovado" : "Reprovado";
            System.out.printf("Aluno %d - Média: %.2f - %s%n", (i + 1), media[i], situacao);
        }

        sc.close();
    }
}
