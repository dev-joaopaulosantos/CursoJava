package exercicios.condicionais;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("*** VERIFICAR SE UM NÚMERO É POSITIVO OU NEGATIVO ***");

            System.out.print("Digite um número: ");
            int num = scan.nextInt();

            if (num < 0) {
                System.out.println("O número digitado foi " + num + ", e ele é NEGATIVO");
            } else {
                System.out.println("O número digitado foi " + num + ", e ele é POSITIVO");
            }
        }
    }
}
