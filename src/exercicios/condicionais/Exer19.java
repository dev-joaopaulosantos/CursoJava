package exercicios.condicionais;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Digite o 1° número: ");
            int num1 = scan.nextInt();

            System.out.print("Digite o 2° número: ");
            int num2 = scan.nextInt();

            System.out.print("Informe a operação (+ - / *): ");
            String operacao = scan.next();

            double resultado = 0;
            boolean valida = true;
            String msg1 = "";
            String msg2 = "";

            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                default:
                    valida = false;
                    break;
            }

            if (valida) {
                if (resultado >= 0) {
                    msg1 = "POSSIIVO";
                } else {
                    msg1 = "NEGATIVO";
                }
                if (resultado % 2 == 0) {
                    msg2 = "PAR";
                } else {
                    msg2 = "ÍMPAR";
                }
                System.out.println("Resultado: " + resultado + " => " + msg1 + " e " + msg2);
            } else {
                System.out.println("Operação inválida!");
            }
        }
    }
}
