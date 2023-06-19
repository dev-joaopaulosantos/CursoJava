package exercicios.condicionais;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o 1° número: ");
            int num1 = scan.nextInt();

            System.out.print("Digite o 2° número: ");
            int num2 = scan.nextInt();

            System.out.print("Digite o 3° número: ");
            int num3 = scan.nextInt();

            System.out.print("Números em ordem decrescente: ");
            if (num1 < num2 && num1 < num3 && num2 < num3) {
                System.out.println(num3 + " - " + num2 + " - " + num1);
            } else if (num1 < num2 && num1 < num3 && num3 < num2) {
                System.out.println(num2 + " - " + num3 + " - " + num1);
            } else if (num2 < num1 && num2 < num3 && num1 < num3) {
                System.out.println(num3 + " - " + num1 + " - " + num2);
            } else if (num2 < num1 && num2 < num3 && num3 < num1) {
                System.out.println(num1 + " - " + num3 + " - " + num2);
            } else if (num3 < num1 && num3 < num2 && num1 < num2) {
                System.out.println(num2 + " - " + num1 + " - " + num3);
            } else if (num3 < num1 && num3 < num2 && num2 < num1) {
                System.out.println(num1 + " - " + num2 + " - " + num3);
            }
        }
    }
}
