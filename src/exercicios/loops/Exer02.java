package exercicios.loops;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Nome de usuário: ");
            String usuario = scan.next();

            System.out.print("Senha: ");
            String senha = scan.next();

            while (usuario.equalsIgnoreCase(senha)) {
                System.out.println("Usuario e Senha não podem ser iguais!");

                System.out.print("Nome de usuário: ");
                usuario = scan.next();

                System.out.print("Senha: ");
                senha = scan.next();
            }

            System.out.println("USUARIO: " + usuario + "SENHA: " + senha);
        }
    }
}
