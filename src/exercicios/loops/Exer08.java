package exercicios.loops;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            int num = 0;
            int soma = 0;
            double media = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.print(i + "° Número: ");
                num = scan.nextInt();

                soma += num;
            }

            media = (soma / 5);

            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
        }
    }
}
