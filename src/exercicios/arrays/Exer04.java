package exercicios.arrays;

public class Exer04 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                cont++;
            }
        }

        System.out.println("O array contem " + cont + " números pares!");

    }
}
