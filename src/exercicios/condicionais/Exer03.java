package exercicios.condicionais;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Digite se sexo (F ou M): ");
            String sexo = scan.next();

            if (sexo.equalsIgnoreCase("f")) {
                System.out.println("Você selecionou o sexo (Feminino)");

            } else if (sexo.equalsIgnoreCase("m")) {
                System.out.println("Você selecionou o sexo (Masculino)");

            } else {
                System.out.println("Você selecionou um sexo inválido");
            }
        }
    }
}
