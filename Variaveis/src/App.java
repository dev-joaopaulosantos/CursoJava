// Variaveis Tipos Primitivos

public class App {

    public static void main(String[] args) {
        // Tipos Inteiros:
        byte v01 = 99; // vai de -128 a 127
        short v02 = 26000; // vai de -32.768 a 32.767
        int v03 = 1900000000; // vai de -2.147.483.648 a 2.147.483.647
        long v04 = 9223372036854775807L; // vai de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

        // Ponto Flutuante:
        double valorPassagem = 5.90; // vai de -1,7976E + 308 a 1,7976E + 308
        float valorTomate = 2.90F; // -3,4028E + 38 a 3,4028E + 38

        // char
        char o = 'o'; // recebe apenas 1(um) caractere ou o código de um caractere
        char i = 'i';
        char interrogacao = 63;

        // boolean
        boolean aprovado = false;

        System.out.println("Mostrando variaveis: " + v01 + ", " + v02 + ", " + v03 + ", " + v04);
        System.out.println("Valor da Passagem: " + valorPassagem);
        System.out.println("Valor do Tomate: " + valorTomate);
        System.out.println("Saudação: " + o + i + interrogacao);
        System.out.println("Aprovado: " + aprovado);
    }
}
