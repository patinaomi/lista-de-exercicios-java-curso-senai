package listaexercicios02;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        float num = 0, menorValor = 0, maiorValor = 0;

        Scanner input = new Scanner(System.in);

        for(int i = 1; i<=10; i++) {

            do {
                System.out.print("Digite o valor do produto: ");
                num = input.nextFloat();

                if(num <= 0) {
                    System.out.println("Valor inválido, digite novamente.");
                }

            } while(num <= 0);

            if(i == 1) {
                menorValor = num;
                maiorValor = num;
            } else {
                if(num < menorValor) {
                    menorValor = num;
                }
                if(num > maiorValor) {
                    maiorValor = num;
                }
            }
        }

        System.out.printf("Produto de maior valor: R$%.2f\n", maiorValor);
        System.out.printf("Produto de menor valor: R$%.2f", menorValor);
    }

}
