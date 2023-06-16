package com.joaopaulo.cursojava.labs;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        System.out.println("*** CALCULE SEU TEMPO DE DOWNLOAD ***");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Digite o tamanho do arquivo em MB: ");
            double tamanhoArquivo = scan.nextDouble();

            System.out.print("Digite a velocidade da sua internet em MB/s: ");
            double velocidadeInternet = scan.nextDouble();

            double tempoDownload = tamanhoArquivo / velocidadeInternet;

            System.out.println("Tempo de download: " + String.format("%.2f", tempoDownload) + " segundos");
        }
    }
}
