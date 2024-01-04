package listaexercicios02;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int i, j, k, l;
        boolean repetido;

        for(i=0; i<matriz.length; i++) {
            for(j=0; j<matriz[0].length; j++) {
                System.out.printf("Matriz de posição [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                repetido = false;
                for (k = 0; k < matriz.length; k++) {
                    for (l = 0; l < matriz[k].length; l++) {
                        // Verifica se não está comparando o elemento com ele mesmo
                        if (i != k || j != l) {
                            if (matriz[i][j] == matriz[k][l]) {
                                repetido = true;
                                break;
                            }
                        }
                    }
                    if (repetido) break;
                }
                if (repetido) {
                    System.out.println("Elemento repetido encontrado: " + matriz[i][j]);
                    break;
                }
            }
        }
    }
}
