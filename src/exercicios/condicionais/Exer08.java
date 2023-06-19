package exercicios.condicionais;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o valor do 1° número: ");
            double preco1 = scan.nextDouble();

            System.out.print("Digite o valor do 3° número: ");
            double preco2 = scan.nextDouble();

            System.out.print("Digite o valor do 4° número: ");
            double preco3 = scan.nextDouble();

            if (preco1 < preco2 && preco1 < preco3) {
                System.out.println("O menor preço é: " + preco1);
            } else if (preco2 < preco1 && preco2 < preco3) {
                System.out.println("O menor preço é: " + preco2);
            } else if (preco3 < preco1 && preco3 < preco2) {
                System.out.println("O menor preço é: " + preco3);
            } else {
                System.out.println("Existem preços iguais!");
            }
        }
    }
}