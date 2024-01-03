package listaexercicios02;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];
        int[] vetorMult = new int[5];

        for(int i=0; i<vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextInt();
        }

        for(int i=0; i<vetor.length; i++) {
            vetorMult[i] = vetor[i] * 5;
            System.out.printf("[%d]", vetor[i]);
            System.out.printf("[%d]\n", vetorMult[i]);
        }
    }
}
