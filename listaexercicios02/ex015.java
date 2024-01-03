package listaexercicios02;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 7;
        int[] vetorA = new int[qtd];
        int[] vetorB = new int[qtd];
        int[] vetorC = new int[qtd];

        System.out.println("--- Vetor A ---");
        for(int i = 0; i<vetorA.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetorA[i] = input.nextInt();
        }

        System.out.println("--- Vetor B ---");
        for(int i = 0; i<vetorB.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetorB[i] = input.nextInt();
        }

        System.out.println("--- Resultado ---");
        for(int i=0; i<vetorB.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.printf("%d + ", vetorA[i]);
            System.out.printf("%d = ", vetorB[i]);
            System.out.printf("%d \n", vetorC[i]);
        }
    }
}
