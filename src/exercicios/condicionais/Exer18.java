package exercicios.condicionais;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Digite um número: ");
            int num = scan.nextInt();

            String resultado = "";

            if (num % 2 == 0) {
                resultado = "PAR";
            } else {
                resultado = "ÍMPAR";
            }

            System.out.println("O número " + num + " é: " + resultado);
        }
    }
}
