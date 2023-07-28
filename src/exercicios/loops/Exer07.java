package exercicios.loops;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = -1;
        int maior = -1;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "° Número: ");
            num = scan.nextInt();

            if (num > maior) {
                maior = num;
            }

        }
        System.out.println("O maior número digitado é: " + maior);

    }
}
