// Lendo dados do teclado

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine(); // Ler a linha completa

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next(); // Ler apenas a primeira palavra

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt(); // Ler um número inteiro

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble(); // Ler um número double


        System.out.println("IFORMAÇÕES:");
        System.out.println("NOME: " + nome + " " + sobrenome);
        System.out.println("IDADE: " + idade + " anos");
        System.out.println("ALTURA: " + altura);
    }
}
