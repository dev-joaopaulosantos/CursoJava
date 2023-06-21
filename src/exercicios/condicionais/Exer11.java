package exercicios.condicionais;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("*** REAJUSTE DE SALÁRIO ***");

            System.out.print("Digite o seu salário: R$");
            double salario = scan.nextDouble();

            int percentualAumento = 0;

            if (salario <= 280) {
                percentualAumento = 20;
            } else if (salario > 280 && salario <= 700) {
                percentualAumento = 15;
            } else if (salario > 700 && salario <= 1500) {
                percentualAumento = 10;
            } else if (salario > 1500) {
                percentualAumento = 5;
            }

            double valorAumento = (salario / 100) * percentualAumento;
            double novoSalario = salario + valorAumento;

            if (salario <= 0) {
                System.out.println("O valor informado é inválido!");
            } else {
                System.out.println("Seu salário antes do reajuste: R$" + String.format("%.2f", salario));
                System.out.println("Porcentagem de aumento: " + percentualAumento + "%");
                System.out.println("Valor adicional: R$" + String.format("%.2f", valorAumento));
                System.out.println("Seu novo salário: R$" + String.format("%.2f", novoSalario));
            }
        }
    }
}
