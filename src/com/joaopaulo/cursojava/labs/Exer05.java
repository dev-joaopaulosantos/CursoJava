package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        System.out.println("CONVERSOR DE METROS PARA CENTÍMETROS");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de metros: ");
            double metros = scan.nextDouble();

            double centimetros = metros * 100;

            System.out.println("Resultado: " + metros + "m é igual a " + centimetros + "cm");
        }
    }
}
