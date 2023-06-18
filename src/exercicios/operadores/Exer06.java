package exercicios.operadores;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        System.out.println("CAULCULADORA DE ÁREA DE UM CÍRCULO");

        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Digite o raio do círculo: ");
            double raio = scan.nextDouble();
            double pi = 3.14;
            double area = pi * Math.pow(raio, 2);

            System.out.println("A área do circulo em cm é: " + area + "cm²");
        }

    }
}
