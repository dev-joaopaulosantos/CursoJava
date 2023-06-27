package exercicios.condicionais;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o lado 'A' do triangulo: ");
            int ladoA = scan.nextInt();

            System.out.print("Digite o lado 'B' do triangulo: ");
            int ladoB = scan.nextInt();

            System.out.print("Digite o lado 'C' do triangulo: ");
            int ladoC = scan.nextInt();

            if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) {
                String tipoTtiangulo = "";

                if (ladoA == ladoB && ladoB == ladoC) {
                    tipoTtiangulo = "Equilátero";
                } else if (ladoA != ladoB && ladoB != ladoC) {
                    tipoTtiangulo = "Escaleno";
                } else {
                    tipoTtiangulo = "Isósceles";
                }

                System.out.println("Os lados informados formam um triangulo " + tipoTtiangulo);

            } else {
                System.out.println("Os lado informados não formam um triangulo!");
            }
        }

    }
}
