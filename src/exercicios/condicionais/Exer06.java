package exercicios.condicionais;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("*** MOSTRAR MAIOR NÚMERO ***");

            System.out.print("Digite o 1° número: ");
            int num1 = scan.nextInt();

            System.out.print("Digite o 2° número: ");
            int num2 = scan.nextInt();

            System.out.print("Digite o 3° número: ");
            int num3 = scan.nextInt();

            if (num1 > num2 && num1 > num3) {
                System.out.println("O maior número é: " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("O maior número é: " + num2);
            } else if (num3 > num1 && num3 > num2) {
                System.out.println("O maior número é: " + num3);
            } else {
                System.out.println("Existem números iguais!");
            }
        }
    }
}
