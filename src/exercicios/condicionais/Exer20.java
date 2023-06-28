package exercicios.condicionais;

import java.util.Scanner;

public class Exer20 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int qtd = 0;
            String resultado = "";

            System.out.print("Você telefonou para a vítima? ");
            String perguntaA = scan.next();

            System.out.print("Você esteve no local do crime? ");
            String perguntaB = scan.next();

            System.out.print("Você mora perto da vítima? ");
            String perguntaC = scan.next();

            System.out.print("Você devia para a vítima? ");
            String perguntaD = scan.next();

            System.out.print("Você já trabalhou com a vítima? ");
            String perguntaE = scan.next();

            if (perguntaA.equalsIgnoreCase("sim")) {
                qtd++;
            }
            if (perguntaB.equalsIgnoreCase("sim")) {
                qtd++;
            }
            if (perguntaC.equalsIgnoreCase("sim")) {
                qtd++;
            }
            if (perguntaD.equalsIgnoreCase("sim")) {
                qtd++;
            }
            if (perguntaE.equalsIgnoreCase("sim")) {
                qtd++;
            }

            if (qtd > 0 && qtd <= 2) {
                resultado = "SUSPEITO";
            } else if (qtd > 2 && qtd <= 4) {
                resultado = "CÚMPLICE";
            } else if (qtd == 5) {
                resultado = "CULPADO";
            } else {
                resultado = "INOCENTE";
            }

            System.out.println("Suas respostas foram: " + perguntaA + ", " + perguntaB + ", " + perguntaC + ", " + perguntaD + ", " + perguntaE);
            System.out.println("O resultado do seu julgamento é: " + resultado);
        }

    }
}
