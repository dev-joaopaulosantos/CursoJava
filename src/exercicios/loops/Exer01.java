package exercicios.loops;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Digite um número de 0 a 10: ");
            int num = scan.nextInt();

            while (num < 0 || num > 10) {
                System.out.print("Número inválido! Digite um número de 0 a 10: ");
                num = scan.nextInt();
            }
        }

        System.out.println("Você digitou um número válido!");
    }
}
