public class Operadores {
    public static void main(String[] args) {

        // Variáveis
        int n1 = 2;
        int n2 = 4;
        
        // Operadores aritméticos
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        int resultadoAdicao = n1 + n2;
        int resultadoSubtracao = n1 - n2;
        int resultadoMultiplicacao = n1 * n2;
        int resultadoDivisao = n1 / n2;

        System.out.println("ADIÇÃO: " + resultadoAdicao);
        System.out.println("SUBTRAÇÃO: " + resultadoSubtracao);
        System.out.println("MULTIPLICAÇÃO: " + resultadoMultiplicacao);
        System.out.println("DIVISÃO: " + resultadoDivisao);

        // Operadores relacionais
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1 != n2: " + (n1 != n2));
        System.out.println("n1 > n2: " + (n1 > n2));
        System.out.println("n1 >= n2: " + (n1 >= n2));
        System.out.println("n1 < n2: " + (n1 < n2));
        System.out.println("n1 <= n2: " + (n1 <= n2));

        // Operadores lógicos
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        boolean resultado1 = (n1 == n2) && (n2 == 4);
        boolean resultado2 = (n1 != 10) || (n2 == 4);
        System.out.println("n1 é igual a n2 E n2 é igual a 4: " + resultado1);
        System.out.println("n1 é diferente de 10 OU n2 é igual a 4: " + resultado2);
    }
}
