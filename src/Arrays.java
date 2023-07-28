public class Arrays {
    public static void main(String[] args) {
        // Arrays ou Vetores

        double[] temperaturas = { 30.1, 30.2, 30.4, 30.5, 30.7, 30.9, 31.3, 32.7 };

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Dia " + (i + 1) + " = " + temperaturas[i] + "°C");
        }

        // Semelhante ao ForEach
        for (double temperatura : temperaturas) {
            System.out.println(temperatura + "°C");
        }
    }
}
