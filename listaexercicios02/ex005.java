package listaexercicios02;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0, cont = 0;

        do {
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            cont++;
            soma+= num;
        } while(soma <= 100);

        System.out.printf("Quantidade de valores lidos: %d", cont);

    }
}
