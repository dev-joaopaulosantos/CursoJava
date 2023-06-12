package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("CALCULADORA DE MÉDIA BIMESTRAL");

            System.out.println("Digite sua 1ª nota: ");
            double nota1 = scan.nextDouble();

            System.out.println("Digite sua 2ª nota: ");
            double nota2 = scan.nextDouble();

            System.out.println("Digite sua 3ª nota: ");
            double nota3 = scan.nextDouble();

            System.out.println("Digite sua 4ª nota: ");
            double nota4 = scan.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("Sua média bimestral é: " + media);
        }
    }
}
