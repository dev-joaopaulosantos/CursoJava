package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        System.out.println("*** CALCULADORA DE SÁLARIO ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o valor da hora trabalhada: ");
            double valorHora = scan.nextDouble();

            System.out.print("Digite o número de horas trabalhadas no mês: ");
            double qtdHoras = scan.nextDouble();

            double salario = valorHora * qtdHoras;
            System.out.println("Seu salário é: " + "R$" + salario);
        }
    }
}