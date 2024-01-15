package listaexercicios02;

import java.util.Scanner;

public class ex025 {

    public static void parOuImpar(int num) {
        if(num %2 == 0) {
            System.out.printf("O número %d é PAR.", num);
        } else {
            System.out.printf("O número %d é ÍMPAR.", num);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("\nDigite um número: ");
            int num = input.nextInt();
            parOuImpar(num);
        }
    }
}
