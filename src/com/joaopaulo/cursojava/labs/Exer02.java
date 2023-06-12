package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            double num = scan.nextDouble();

            System.out.println("O número digitado foi: " + num);
        }
    }
}