package listaexercicios02;

import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtd = 4, i, j;
        int[][] matriz = new int[qtd][qtd];
        int[][] matrizMult = new int[qtd][qtd];

        for(i=0; i<matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.printf("Matriz de posição [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        for(i=0; i<matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                matrizMult[i][j] = matriz[i][j] * matriz[i][j];
            }
        }

        System.out.println("\nRESULTADO MATRIZ");
        for(i=0; i<matrizMult.length; i++) {
            for (j = 0; j < matrizMult[i].length; j++) {
                System.out.printf("[%02d] ", matrizMult[i][j]);
            }
            System.out.println();
        }
    }
}
