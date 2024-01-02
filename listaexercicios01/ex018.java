package listaexercicios01;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        int soma0a25 = 0, soma26a50 = 0, soma51a75 = 0, soma76a100 = 0;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Digite um valor: ");
            int num = input.nextInt();

            if(num == 0) {
                break;
            } else if (num <= 25) {
                soma0a25++;
            } else if(num <= 50) {
                soma26a50++;
            } else if(num <= 75) {
                soma51a75++;
            } else if(num <= 100) {
                soma76a100++;
            }
        }
        System.out.println("\nQuantidade de elementos");
        System.out.printf("[0-25]: %d\n", soma0a25);
        System.out.printf("[26-50]: %d\n", soma26a50);
        System.out.printf("[51-75]: %d\n", soma51a75);
        System.out.printf("[76-100]: %d", soma76a100);

    }
}
