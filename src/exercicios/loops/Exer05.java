package exercicios.loops;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valido = true;

        double populacaoA;
        double populacaoB;
        double taxaA;
        double taxaB;
        int count = 0;

        do {
            System.out.print("População do país A: ");
            populacaoA = scan.nextInt();
            System.out.print("População do país B: ");
            populacaoB = scan.nextInt();
            System.out.print("Taxa de crescimento do país A: ");
            taxaA = scan.nextDouble();
            System.out.print("Taxa de crescimento do país B: ");
            taxaB = scan.nextDouble();

            if (populacaoA <= 0 || populacaoB <= 0 || taxaA <= 0 || taxaB <= 0) {
                System.out.println("Dados Inválidos!");
                valido = false;
            } else {
                valido = true;
            }

        } while (!valido);

        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;

            count++;
        }

            System.out.println("País A: " + String.format("%.0f", populacaoA));
            System.out.println("País B: " + String.format("%.0f", populacaoB));
            System.out.println("Anos para o país A ultrapassar o país B: " + count + " anos");
    }
}
