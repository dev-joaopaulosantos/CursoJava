package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        System.out.println("*** CONVERSOR DE TEMPERATURA ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em Farenheit: ");
            double farenheit = scan.nextDouble();

            double celsius = (5 * (farenheit - 32) / 9);

            System.out.println(farenheit + " °F = " + celsius + " °C");
        }
    }
}
