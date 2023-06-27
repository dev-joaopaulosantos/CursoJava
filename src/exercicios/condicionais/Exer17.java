package exercicios.condicionais;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scan.nextInt();

        String resultado = "";

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            resultado = "SIM";
        } else{
            resultado = "NÂO";
        }

        System.out.println("O ano de " + ano + " é bissexto? " + resultado);
    }
}
