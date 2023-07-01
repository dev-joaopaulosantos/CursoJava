public class Loops {
    public static void main(String[] args) {

        int i = 0;
        int max = 10;

        System.out.println("Contando de " + i + " até " + max);

        // While
        while(i <= max){
            System.out.print(i + ", ");
            i++;
        }
        System.out.println("Fim.");


        // Do While
        do{
            i++;
            System.out.print(i + ", ");
        } while(i < 15);
        System.out.println("Fim.");
    }
}
