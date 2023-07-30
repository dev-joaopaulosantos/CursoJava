package exercicios.matrizes;

import java.util.Random;

public class Exer01 {
    public static void main(String[] args) {
        int[][] arrayNumeros = new int[4][4];

        Random num = new Random();

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = num.nextInt(10, 99);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                if(arrayNumeros[i][j] > maior){
                    maior = arrayNumeros[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.print(arrayNumeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
