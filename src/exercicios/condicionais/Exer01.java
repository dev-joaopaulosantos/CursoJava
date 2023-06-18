package exercicios.condicionais;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("*** COMPARAR DOIS NÚMEROS ***");

            System.out.print("Digite o 1° número: ");
            double num1 = scan.nextDouble();

            System.out.print("Digite o 2° número: ");
            double num2 = scan.nextDouble();

            if (num1 > num2) {
                System.out.println("O maior número é: " + num1);
            } else if (num1 < num2) {
                System.out.println("O maior número é: " + num2);
            } else {
                System.out.println("Os números são iguais!");
            }
        }
    }
}
