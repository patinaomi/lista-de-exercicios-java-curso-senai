package listaexercicios02;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int[][] matrizMod = new int[3][4];
        int i,j ;

        for(i=0; i<matriz.length; i++) {
            for(j=0; j<matriz[i].length; j++) {
                System.out.printf("Matriz de posição [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        for(i=0; i<matriz.length; i++) {
            for(j=0; j<matriz[i].length; j++) {
                matrizMod[i][j] = matriz[i][j];

                if(matrizMod[i][j] < 0) {
                    matrizMod[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz Original");
        for(i=0; i<matriz.length; i++) {
            for(j=0; j<matriz[0].length; j++) {
                System.out.printf("[%02d]", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matriz Modificada");
        for(i=0; i<matrizMod.length; i++) {
            for(j=0; j<matrizMod[0].length; j++) {
                System.out.printf("[%02d]", matrizMod[i][j]);
            }
            System.out.println();
        }
    }
}
