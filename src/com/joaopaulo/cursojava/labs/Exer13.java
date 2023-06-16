package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        System.out.println("*** CALCULADORA DE SÁLARIO ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o valor da hora trabalhada: ");
            double valorHora = scan.nextDouble();

            System.out.print("Digite o número de horas trabalhadas no mês: ");
            double qtdHoras = scan.nextDouble();

            double salario = valorHora * qtdHoras;
            double inss = salario * 0.08;
            double sindicato = salario * 0.05;
            double ir = salario * 0.11;
            double descontos = inss + sindicato + ir;
            double salarioLiquido = salario - descontos;

            System.out.println("Salário bruto: " + "R$" + String.format("%.2f", salario));
            System.out.println("Taxa INSS: " + "R$" + String.format("%.2f", inss));
            System.out.println("Taxa Sindicato: " + "R$" + String.format("%.2f", sindicato));
            System.out.println("Imposto de Renda: " + "R$" + String.format("%.2f", ir));
            System.out.println("Total de Descontos: " + "R$" + String.format("%.2f", descontos));
            System.out.println("Salário Liquido: " + "R$" + String.format("%.2f", salarioLiquido));
        }
    }
}
