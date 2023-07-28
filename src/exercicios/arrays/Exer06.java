package exercicios.arrays;

public class Exer06 {
    public static void main(String[] args) {
        
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int soma = 0;
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                soma += array[i];
                cont++;
            }
        }

        double media = soma / cont;

        System.out.println("Média dos números impares: " + media);
    }
}
