package exercicios.condicionais;

import java.util.Scanner;

public class Exer21 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Quantidade de litros que deseja abastecer: ");
            int qtdLitros = scan.nextInt();

            System.out.print("Gasolina [G] ou Alcool [A] ");
            String combustivel = scan.next();

            double valorGasolina = 2.50;
            double valorAlcool = 1.90;
            int porcentagemDesconto = 0;
            double total = 0;

            if (combustivel.equalsIgnoreCase("G")) {
                if ((qtdLitros > 0 && qtdLitros <= 20)) {
                    porcentagemDesconto = 4;
                } else {
                    porcentagemDesconto = 6;
                }
                total = (qtdLitros * valorGasolina);

            } else if (combustivel.equalsIgnoreCase("A")) {
                if ((qtdLitros > 0 && qtdLitros <= 20)) {
                    porcentagemDesconto = 3;
                } else {
                    porcentagemDesconto = 5;
                }
                total = (qtdLitros * valorAlcool);
            }

            double valorDesconto = (total / 100) * porcentagemDesconto;
            double valorFinal = total - valorDesconto;

            if (qtdLitros > 0 && (combustivel.equalsIgnoreCase("G") || combustivel.equalsIgnoreCase("A"))) {
                System.out.println("| Qtd de litros: " + qtdLitros + " | Valor a pagar: R$ " + valorFinal + " |");

            } else {
                System.out.println("Dados inválidos!");

            }
        }
    }
}
