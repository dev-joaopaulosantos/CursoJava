package exercicios.condicionais;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite uma letra: ");
            String letra = scan.next();

            if (letra.length() > 1) {
                System.out.println("Digite apenas uma letra!");
            } else {
                if (letra.equalsIgnoreCase("a") ||
                        letra.equalsIgnoreCase("e") ||
                        letra.equalsIgnoreCase("i") ||
                        letra.equalsIgnoreCase("o") ||
                        letra.equalsIgnoreCase("u")) {
                    System.out.println("A letra digitada é uma VOGAL");
                } else {
                    System.out.println("A letra digitada é uma CONSOANTE");
                }
            }
        }
    }
}
