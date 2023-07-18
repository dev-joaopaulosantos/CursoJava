package exercicios.loops;


public class Exer04 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        int count = 0;

        while(populacaoA <= populacaoB){
            populacaoA += (populacaoA / 100) * 3;
            populacaoB += (populacaoB / 100) * 1.5;

            count++;
        }

        System.out.println("País A: " + String.format("%.0f", populacaoA));
        System.out.println("País B: " + String.format("%.0f", populacaoB));
        System.out.println("Anos para o país A ultrapassar o país B: " + count + " anos");


    }
}
