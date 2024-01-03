package listaexercicios02;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        StringBuilder contPar = new StringBuilder();
        StringBuilder contImpar = new StringBuilder();

        for(int i=0; i<vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextInt();

            if(vetor[i] %2 == 0) {
                contPar.append(i).append(" ");
            } else {
                contImpar.append(i).append(" ");
            }
        }

        System.out.println("Números pares: " + contPar);
        System.out.println("Números ímpares: " + contImpar);

    }
}
