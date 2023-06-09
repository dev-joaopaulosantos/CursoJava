package exercicios.condicionais;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        System.out.println("*** MÉDIA DE NOTAS ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite sua 1ª nota: ");
            double nota1 = scan.nextDouble();

            System.out.print("Diogite sua 2ª nota: ");
            double nota2 = scan.nextDouble();

            double media = (nota1 + nota2) / 2;

            System.out.print("Sua média é: " + media);
            if (media < 7) {
                System.out.println(" = REPROVADO");
            } else if (media == 10) {
                System.out.println(" = APROVADO COM DISTINÇÃO");
            } else {
                System.out.println(" = APROVADO");
            }
        }
    }
}