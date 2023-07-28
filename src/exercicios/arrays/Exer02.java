package exercicios.arrays;

public class Exer02 {
    public static void main(String[] args) {
        
        int[] array01 = { 2, 5, 4, 7, 5, 8, 3, 6 };
        int[] array02 = new int[array01.length];

        for (int i = 0; i < array01.length; i++) {
            array02[i] = (array01[i] * 2);
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
