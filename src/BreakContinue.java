public class BreakContinue {
    public static void main(String[] args) {
        // Break -> Usado para sair de um loop
        // Continue -> Continua o loop na proxima interação

        int num = 10;
        int max = 30;

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                System.out.println("O primeiro valor encontado divisível por 7 foi: " + i);
                break;
            }
        }

        System.out.println("-----------------------------------------------------");

        System.out.print("Todos os números, menos os divisíveis por 7: ");
        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.println("FIM!");
    }
}
