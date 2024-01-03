package listaexercicios02;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0, cont = 0;


        for(int i=0; i<5; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextInt();
            soma += vetor[i];
            cont++;
        }
        float media = (float) soma / cont;

        System.out.printf("Média dos elementos dos vetores: %.2f", media);
    }
}
