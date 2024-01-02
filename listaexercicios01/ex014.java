package listaexercicios01;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = input.nextInt();

        if(ano %4 == 0 && ano %100 != 0 || ano %400 == 0) {
            System.out.printf("O ano %d é BISSEXTO", ano);
        } else {
            System.out.printf("O ano %d NÃO é bissexto", ano);
        }

    }
}
