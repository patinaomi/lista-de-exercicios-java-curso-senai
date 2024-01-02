package listaexercicios02;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0, contPar = 0, contImpar = 0, somaGeral = 0;
        float mediaPar = 0;

        while(true) {
            System.out.print("Digite um número positivo: ");
            int num = input.nextInt();

            if(num == 0) {
                break;
            } else if (num > 0 && num %2 == 0) {
                contPar++;
                mediaPar += num;
            } else if(num > 0) {
                contImpar++;
            }
            cont++;
            somaGeral+= num;
        }

        float resultado = mediaPar / cont;
        float resultadoGeral = (float) somaGeral / cont;

        System.out.println("Quantidade números pares: " + contPar);
        System.out.println("Quantidade números ímpares: " + contImpar);
        System.out.println("Média de valores pares: " + resultado);
        System.out.println("Média geral dos valores lidos: " + resultadoGeral);

    }
}
