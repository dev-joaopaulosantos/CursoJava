package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        System.out.println("*** *** *** ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int n1 = scan.nextInt();

            System.out.print("Digite outro número inteiro: ");
            int n2 = scan.nextInt();

            System.out.print("Digite um número real: ");
            double n3 = scan.nextDouble();

            int resultado1 = (n1 * n2) * (n2 / 2);
            double resultado2 = (n1 * 3) + n3;
            double resultado3 = Math.pow(n3, 3);

            System.out.println("O produto do dobro do primeiro com metade do segundo: " + resultado1);
            System.out.println("A soma do triplo do primeiro com o terceiro: " + resultado2);
            System.out.println("O terceiro elevado ao cubo: " + resultado3);
        }
    }
}
