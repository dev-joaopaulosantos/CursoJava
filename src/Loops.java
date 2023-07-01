public class Loops {
    public static void main(String[] args) {

        int i = 0;
        int max = 10;

        // While
        System.out.print("While: ");
        while(i <= max){
            System.out.print(i + ", ");
            i++;
        }
        System.out.println("Fim.");

        // Do While
        System.out.print("Do While: ");
        do{
            i++;
            System.out.print(i + ", ");
        } while(i < 20);
        System.out.println("Fim.");

        // For
        System.out.print("For: ");
        for(int count = 0; count < 11; count++){
            System.out.print(count + ", ");
        }
        System.out.println("Fim.");
    }
}
