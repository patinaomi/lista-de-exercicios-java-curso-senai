package listaexercicios02;

public class ex024 {
    public static void main(String[] args) {
        String[][] matriz = new String[5][5];
        int cont = 0, i, j;

        for(i=0; i<matriz.length; i++) {
            for(j=0; j<matriz[i].length; j++) {
                if(i == cont && j == cont) {
                    matriz[i][j] = "A";
                    cont++;
                } else if(i == 3 && j == 2) {
                    matriz[i][j] = "C";
                }
                else {
                    matriz[i][j] = "B";
                }

            }
        }

        for(i=0; i<matriz.length; i++) {
            for(j=0; j<matriz[i].length; j++) {
                System.out.printf("[%s] ", matriz[i][j]);
            }
            System.out.println();
        }


    }
}
