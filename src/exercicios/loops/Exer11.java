package exercicios.loops;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int soma = 0;

            System.out.print("Digite o 1° número: ");
            int n1 = scan.nextInt();

            System.out.print("Digite o 2° número: ");
            int n2 = scan.nextInt();

            for (int i = n1; i <= n2; i++) {
                System.out.print(i + ", ");
                soma += i;
            }

            System.out.println("Soma: " + soma);
        }
    }
}
