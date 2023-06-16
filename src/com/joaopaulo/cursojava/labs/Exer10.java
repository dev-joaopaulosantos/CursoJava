package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        System.out.println("*** CONVERSOR DE TEMPERATURA ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a temperatura em celsius: ");
            double celsius = scan.nextDouble();

            double farenheit = celsius * 1.8 + 32;

            System.out.println(celsius + " °C = " + farenheit + " °F");
        };
    }
}
