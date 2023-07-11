package exercicios.loops;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            
            String nome;
            String sexo;
            String estadoCivil;
            double salario;
            int idade;

            boolean dadosValidos = false;

            do {
                System.out.print("Nome: ");
                nome = scan.next();

                System.out.print("Idade: ");
                idade = scan.nextInt();

                System.out.print("Salário: ");
                salario = scan.nextDouble();

                System.out.print("Sexo: ");
                sexo = scan.next();

                System.out.print("Estado Civil: ");
                estadoCivil = scan.next();

                if ((nome.length() > 3) && (idade > 0 && idade < 150) && (salario > 0)) {
                    if ((sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M"))) {
                        if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C")
                                || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")) {
                            dadosValidos = true;
                            System.out.println("+---------------------------+");
                            System.out.println("         INFORMAÇÕES         ");
                            System.out.println("+---------------------------+");
                            System.out.println("Nome: " + nome);
                            System.out.println("-----------------------------");
                            System.out.println("Idade: " + idade);
                            System.out.println("-----------------------------");
                            System.out.println("Salário: " + salario);
                            System.out.println("-----------------------------");
                            System.out.println("Sexo: " + sexo);
                            System.out.println("-----------------------------");
                            System.out.println("Estado Civil: " + estadoCivil);
                            System.out.println("+---------------------------+");
                        }
                    } else {
                        System.out.println("Dados Inválidos!");
                    }

                }
            } while (!dadosValidos);
        }
    }
}
