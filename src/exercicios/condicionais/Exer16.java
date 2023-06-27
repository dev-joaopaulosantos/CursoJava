package exercicios.condicionais;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o valor de 'A': ");
            int a = scan.nextInt();

            if (a == 0) {
                System.out.println("Não é equação de 2º grau!");
            } else {
                System.out.print("Digite o valor de 'B': ");
                int b = scan.nextInt();

                System.out.print("Digite o valor de 'C': ");
                int c = scan.nextInt();

                double delta = (b * b) - (4 * a * c);

                if (delta < 0) {
                    System.out.println("Delta negativo!");
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                    System.out.println("Delta: " + delta);
                    System.out.println("x1: " + x1);
                    System.out.println("x2: " + x2);
                }
            }
        }

    }
}
