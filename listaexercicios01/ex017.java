package listaexercicios01;
import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0, positivo = 0, negativo = 0;
        int cont = 0, contPos = 0, contNeg = 0;


        while(true) {
            System.out.print("Digite um número: ");
            int num = input.nextInt();

            if(num == 0) {
                break;
            }
            if(num > 0) {
                positivo += num;
                contPos++;
            } else {
                negativo += num;
                contNeg++;
            }

            soma += num;
            cont++;
        }

        float percentualPos = (float) (contPos * 100) / cont;
        float percentualNeg = (float) (contNeg * 100) / cont;
        float media = (float) soma / cont;

        System.out.printf("Média aritmética dos valores lidos: %.2f\n", media );
        System.out.printf("Quantidade de valores positivos: %d. Total: %.2f%% \n", contPos, percentualPos);
        System.out.printf("Quantidade de valores negativos: %d. Total: %.2f%%", contNeg, percentualNeg);


    }
}
