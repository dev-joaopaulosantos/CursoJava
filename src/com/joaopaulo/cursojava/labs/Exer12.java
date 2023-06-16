package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        System.out.println("*** CALCULE SEU PESO IDEAL ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite sua altura: ");
            double altura = scan.nextDouble();

            double pesoIdeal = (72.7 * altura) - 58;

            String resultado = String.format("%.2f", pesoIdeal);
            System.out.println("Seu peso ideal é: " + resultado + "Kg");
        }
    }
}
