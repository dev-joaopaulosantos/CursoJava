package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        System.out.println("CALCULADORA DE ÁREA DE UM QUADRADO");

        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Digite o lado do quadrado em cm: ");
            double lado = scan.nextDouble();

            double area = Math.pow(lado, 2);

            System.out.println("Area do quadrado: " + area + "cm²");
            System.out.println("Dobro da area do quadrado: " + (area * 2) + "cm²");
        }
    }
}
