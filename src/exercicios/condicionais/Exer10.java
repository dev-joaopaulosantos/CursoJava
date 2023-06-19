package exercicios.condicionais;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println(" *** *** *** *** *** *** *** *** *** ");

            System.out.println("EM QUE TURNO VOCÊ ESTUDA?");
            System.out.print("M -> Matutino | V -> Vespertino | N -> Noturno: ");
            String turno = scan.next().toUpperCase();

            switch (turno) {
                case "M":
                    System.out.println("Bom Dia!");
                    break;
                case "V":
                    System.out.println("Boa Tarde!");
                    break;
                case "N":
                    System.out.println("Boa Noite!");
                    break;
                default:
                    System.out.println("Informação Inválida!");
                    break;
            }
        }
    }
}
