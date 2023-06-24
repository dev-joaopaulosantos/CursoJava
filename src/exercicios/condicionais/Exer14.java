package exercicios.condicionais;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua 1ª nota: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite sua 2ª nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        String situacao = "";
        String conceito = "";

        if (media <= 10 && media > 9) {
            conceito = "A";
        } else if (media <= 9 && media > 7.5) {
            conceito = "B";
        } else if (media <= 7.5 && media >= 6) {
            conceito = "C";
        } else if (media < 6 && media > 4) {
            conceito = "D";
        } else if (media <= 4 && media >= 0) {
            conceito = "F";
        }

        if (media >= 0 && media < 6) {
            situacao = "REPROVADO";
        } else {
            situacao = "APROVADO";
        }

        if (media >= 0 && media <= 10) {
            System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2 + " | Média: " + media + " | Conceito: "
                    + conceito + " | Situação: " + situacao);
        } else{
            System.out.println("Dados incorretos!");
        }
    }
}
