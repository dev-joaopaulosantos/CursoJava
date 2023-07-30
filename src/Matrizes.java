import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {

        // Arrays Multidimensionais

        double[][] notasAlunos = new double[2][4];

        // Notas 1° aluno
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        // Notas 2° aluno
        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 7.2;
        notasAlunos[1][3] = 8.5;

        // Imprimindo matrizes no console
        for (int i = 0; i < notasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();
        }

        // Arrays Tridimensionais
        System.out.println();

        int[][][] arrayTridimensional = new int[3][3][3];

        for (int i = 0; i < arrayTridimensional.length; i++) {
            for (int j = 0; j < arrayTridimensional[i].length; j++) {
                for (int k = 0; k < arrayTridimensional[i][j].length; k++) {
                    arrayTridimensional[i][j][k] = i + j + k; // Atribuindo valores
                }
            }
        }

        // Imprimindo array tridimensional no console
        for (int i = 0; i < arrayTridimensional.length; i++) {
            for (int j = 0; j < arrayTridimensional[i].length; j++) {
                for (int k = 0; k < arrayTridimensional[i][j].length; k++) {
                    System.out.print(arrayTridimensional[i][j][k] + " ");
                }
            }
            System.out.println();
        }

        // Arrays irregulares
        System.out.println();

        try (Scanner scan = new Scanner(System.in)) {
            String[][] nomesFilhos = new String[3][];

            for (int i = 0; i < nomesFilhos.length; i++) {
                System.out.print("Quantidade de filhos? ");

                int quantidadeFilhos = scan.nextInt();

                nomesFilhos[i] = new String[quantidadeFilhos];

                for (int j = 0; j < nomesFilhos[i].length; j++) {
                    System.out.print("Nome do filho " + (i + j) + ": ");

                    nomesFilhos[i][j] = scan.next();
                }
            }

            for (int i = 0; i < nomesFilhos.length; i++) {
                System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos: ");
                for (int j = 0; j < nomesFilhos[i].length; j++) {
                    System.out.println(nomesFilhos[i][j] + " ");
                }
            }
        }
    }
}
