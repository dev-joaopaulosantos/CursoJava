package exercicios.loops;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Digite o 1° número: ");
            int n1 = scan.nextInt();

            System.out.print("Digite o 2° número: ");
            int n2 = scan.nextInt();

            System.out.print("Os números ente " + n1 + " e " + n2 + " são: ");

            for (int i = (n1 + 1); i < n2; i++) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("FIM!");
    }
}
