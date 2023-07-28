package exercicios.arrays;

public class Exer03 {
    public static void main(String[] args) {
        int[] array01 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] array02 = new int[array01.length];

        for (int i = 0; i < array01.length; i++) {
            array02[i] = (array01[i] * array01[i]);
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
