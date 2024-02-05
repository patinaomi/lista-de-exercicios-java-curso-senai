package listaexercicios02;

import java.util.Scanner;

public class ex026 {
    public static void menorNum(float[] vetor) {
        float menor = vetor[0];

        for(int i=0; i<vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Menor número: "+ menor);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] vetor = new float[5];

        for(int i=0; i<vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextFloat();
        }
        menorNum(vetor);
    }
}
