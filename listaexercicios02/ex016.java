package listaexercicios02;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 10;
        float[] vetor = new float[qtd];
        float[] vetorQuad = new float[qtd];

        for(int i=0; i<vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextInt();
        }

        for(int i=0; i<vetorQuad.length; i++) {
            vetorQuad[i] = (float) Math.pow(vetor[i], 2);
        }
        System.out.println("----- Resultado -----");
        for(int i=0; i<vetorQuad.length; i++) {
            System.out.printf("[%.2f] - ", vetor[i]);
            System.out.printf("[%.2f] \n", vetorQuad[i]);
        }
    }
}
