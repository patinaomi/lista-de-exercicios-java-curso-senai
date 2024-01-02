package listaexercicios01;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float soma = 0, media, positivo, negativo;
        int cont = 0;
        int num = 0;
        do {
            System.out.print("Digite um número: ");
            num = input.nextInt();
            soma += num;
            cont++;
        } while(num != 0);

        media = soma / cont;

        System.out.printf("Média aritmética dos valores lidos: %.2f", media );


    }
}
