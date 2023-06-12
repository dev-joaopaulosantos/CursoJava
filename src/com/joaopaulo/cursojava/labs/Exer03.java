package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o 1º número: ");
            double num1 = scan.nextDouble();

            System.out.println("Digite o 2º número: ");
            double num2 = scan.nextDouble();

            System.out.println("A soma é: " + (num1 + num2));
        }
    }
}
