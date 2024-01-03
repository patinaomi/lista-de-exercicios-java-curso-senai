package listaexercicios02;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        for(int i=0; i<10; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        System.out.printf("Soma dos elementos do vetor: %d", soma);
    }
}
