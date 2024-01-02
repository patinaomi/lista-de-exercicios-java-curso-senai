package listaexercicios02;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial = 1;
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        System.out.printf("Fatorial de %d! - ", num);
        for(int i=num; i>=1; i--) {
            if(i == 1) {
                System.out.printf("%d ", i);
            } else {
                System.out.printf("%d X ", i);
            }
            fatorial *= i;
        }

        System.out.printf("= %d", fatorial);
    }
}
