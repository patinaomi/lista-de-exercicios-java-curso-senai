package listaexercicios02;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[8];
        int neg = 0;
        int cont = 0;

        for(int i =0; i<vetor.length; i++) {
            System.out.printf("Digite o %dº número : ", i+1);
            vetor[i] = input.nextInt();

            if(vetor[i] < 0) {
                cont = i;
                neg = vetor[i];
            }
        }

        System.out.printf("Último número negativo do vetor %d, posição [%d]. ", neg, cont);
    }
}
