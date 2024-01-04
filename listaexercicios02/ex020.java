package listaexercicios02;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int numLinhas = matriz.length;
        int numColunas = matriz[0].length;

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.printf("Matriz de posição [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("\nIMPRESSÃO DA MATRIZ");
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.printf("[%02d]", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Número de linhas: " + numLinhas);
        System.out.println("Número de colunas: " + numColunas);
    }
}
