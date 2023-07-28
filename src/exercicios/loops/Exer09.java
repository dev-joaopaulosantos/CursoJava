package exercicios.loops;

public class Exer09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i % 2 != 0){
                System.out.print(i + ", ");
            }
        }

        System.out.print("FIM!");
    }
}
