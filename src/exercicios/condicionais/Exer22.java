package exercicios.condicionais;

import java.util.Scanner;

public class Exer22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("+------------------+");
        System.out.println("| FRUTARIA DO JOÃO |");
        System.out.println("+------------------+");

        System.out.print("Informe os Kg de morango: ");
        double KgMorango = scan.nextDouble();

        System.out.print("Informe os Kg de Maçã: ");
        double KgMaca = scan.nextDouble();

        double valorKgMorango = 0;
        double valorKgMaca = 0;

        if (KgMorango > 0 && KgMorango <= 5) {
            valorKgMorango = 2.50;
        } else {
            valorKgMorango = 2.20;
        }
        if (KgMaca > 0 && KgMaca <= 5) {
            valorKgMaca = 1.80;
        } else {
            valorKgMaca = 1.50;
        }

        double total = (KgMorango * valorKgMorango) + (KgMaca * valorKgMaca);
        double totalComDesconto = total - (total * 0.10);
        System.out.println("+-------------------------------+");
        System.out.println("Morango: " + KgMorango + "Kg => R$" + valorKgMorango + " o Kg");
        System.out.println("---------------------------------");
        System.out.println("Maçã: " + KgMaca + "Kg => R$" + valorKgMaca + " o Kg");
        System.out.println("---------------------------------");
        if(KgMorango + KgMaca == 8 || total > 25){
            System.out.println("Total a pagar: " + totalComDesconto);
            System.out.println("+-------------------------------+");
        } else{
            System.out.println("Total a pagar: R$" + String.format("%.2f", total));
            System.out.println("+-------------------------------+");
        }
    }
}
