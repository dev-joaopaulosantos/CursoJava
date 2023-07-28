package exercicios.arrays;

public class Exer01 {
    public static void main(String[] args) {
        
        int[] array01 = {1, 4, 7, 8, 0}; // 1ª forma de declarar um array
        int[] array02 = new int[array01.length]; // 2ª forma de declarar um array

        for (int i = 0; i < array01.length; i++) {
            array02[i] = array01[i];
        }

        System.out.print("Array 01: ");
        for (int num : array01) {
            System.out.print(num + ", ");
        }
        System.out.println("FIM!");

        System.out.print("Array 02: ");
        for (int num : array02) {
            System.out.print(num + ", ");
        }
        System.out.println("FIM!");
    }
}
