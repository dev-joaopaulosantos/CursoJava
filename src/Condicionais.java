import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Condicionais IF / ELSE
            System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();

            if (idade >= 18) {
                System.out.println("Você é maior de idade!");
            } else {
                System.out.println("Você não é maior de idade!");
            }

            // Condicional SWITCH CASE
            System.out.print("Digite um dia da semana. 1-7: ");
            int diaSemana = scan.nextInt();

            switch (diaSemana) {
                case 1:
                    System.out.println("Segunda!");
                    break;
                case 2:
                    System.out.println("Terça!");
                    break;
                case 3:
                    System.out.println("Quarta!");
                    break;
                case 4:
                    System.out.println("Quinta!");
                    break;
                case 5:
                    System.out.println("Sexta!");
                    break;
                case 6:
                    System.out.println("Sábado!");
                    break;
                case 7:
                    System.out.println("Domingo!");
                    break;
                default:
                    System.out.println("Dia inválido!");
            }
        }
    }
}
