package exercicios.loops;

import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.print("Ver tabuada de: ");
            int num = scan.nextInt();

            System.out.println("TABUADA DE " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
    }
}
