package listaexercicios02;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int contImpar = 0;

            for(int i=0; i<vetor.length; i++) {
               do {
                   System.out.printf("Digite o %dº número: ", i+1);
                   vetor[i] = input.nextInt();

                   if(vetor[i] <= 0 || vetor[i] > 50) {
                       System.out.println("Digite um valor entre 1 e 50");
                   }

               } while(vetor[i] <= 0 || vetor[i] > 50);
            }

            for(int i=0; i<vetor.length; i++) {
                if(vetor[i] %2 != 0) {
                    contImpar++;
                }
            }

            int[] vetorImpar = new int[contImpar];
            int k=0;

            for(int i=0; i<vetor.length; i++) {
                if(vetor[i] %2 != 0) {
                    vetorImpar[k] = vetor[i];
                    k++;
                }
            }

            System.out.print("Vetor original: ");
            for(int i=0; i<vetor.length; i++) {
                System.out.printf("[%d]", vetor[i]);
            }

            System.out.print("\nÍmpares: ");
            for(int i=0; i<vetorImpar.length; i++) {
                System.out.printf("[%d]", vetorImpar[i]);
            }
    }
}
