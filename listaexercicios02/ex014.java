package listaexercicios02;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 10;
        float[] vetor = new float[qtd];
        float[] vetorCubo = new float[qtd];


        for(int i=0; i<vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextFloat();

            vetorCubo[i] = (float) Math.pow(vetor[i], 3);
        }

        System.out.println("Cubo do Vetor");

        for(int i=0; i<vetor.length; i++) {
            System.out.printf("[%.1f] - ", vetor[i]);
            System.out.printf("[%.1f] \n", vetorCubo[i]);
        }
    }
}
