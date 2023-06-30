package exercicios.condicionais;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Tipo de carne: Filé Duplo (F) - Alcatra (A) - Picanha (P): ");
            String tipo = scan.next();

            System.out.print("Quantidade em Kg: ");
            double qtd = scan.nextDouble();

            System.out.print("Pagamento no cartão? (S ou N): ");
            String cartao = scan.next();

            double valorFile = 4.9;
            double valorAlcatra = 5.9;
            double valorPicanha = 6.9;
            double total = 0;
            double desconto = 0;
            double totalAPagar = 0;
            String tipoCarne = "";
            String tipoPagamento = "A vista";

            if (tipo.equalsIgnoreCase("F")) {
                if (qtd > 5) {
                    valorFile = 5.80;
                }
                total = qtd * valorFile;
                tipoCarne = "Filé Duplo";
            }
            if (tipo.equalsIgnoreCase("A")) {
                if (qtd > 5) {
                    valorAlcatra = 6.80;
                }
                total = qtd * valorAlcatra;
                tipoCarne = "Alcatra";
            }
            if (tipo.equalsIgnoreCase("P")) {
                if (qtd > 5) {
                    valorPicanha = 7.80;
                }
                total = qtd * valorPicanha;
                tipoCarne = "Picanha";
            }

            if (cartao.equalsIgnoreCase("s")) {
                desconto = total * 0.05;
                totalAPagar = total - desconto;
                tipoPagamento = "Cartão";
            } else {
                totalAPagar = total;
            }

            System.out.println("+----------------------------------+");
            System.out.println("|           CUPOM FISCAL           |");
            System.out.println("+----------------------------------+");
            System.out.println("TIPO DE CARNE: " + tipoCarne);
            System.out.println("------------------------------------");
            System.out.println("QUANTIDADE: " + qtd + "Kg");
            System.out.println("------------------------------------");
            System.out.println("TIPO DE PAGAMENTO: " + tipoPagamento);
            System.out.println("------------------------------------");
            System.out.println("TOTAL: R$" + String.format("%.2f", total));
            System.out.println("------------------------------------");
            System.out.println("DESCONTO: R$" + String.format("%.2f", desconto));
            System.out.println("------------------------------------");
            System.out.println("TOTAL A PAGAR: R$" + String.format("%.2f", totalAPagar));
            System.out.println("+----------------------------------+");
        }

    }
}
