package exercicios.arrays;

public class Exer05 {
    public static void main(String[] args) {
        
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        System.out.println("Soma: " + soma);
    }
}
