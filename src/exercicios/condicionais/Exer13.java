package exercicios.condicionais;

import java.util.Scanner;

public class Exer13 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite um número correspondente a um dia da semana: ");
            int numDia = scan.nextInt();

            String dia = "";

            switch (numDia) {
                case 1:
                    dia = "Domingo";
                    break;
                case 2:
                    dia = "Segunda Feira";
                    break;
                case 3:
                    dia = "Terça Feira";
                    break;
                case 4:
                    dia = "Quarta Feira";
                    break;
                case 5:
                    dia = "Quinta Feira";
                    break;
                case 6:
                    dia = "Sexta Feira";
                    break;
                case 7:
                    dia = "Sábado";
                    break;
                default:
                    dia = "Não é um dia da semana válido!";
                    break;
            }

            System.out.println("Dia: " + dia);
        }

    }
}
