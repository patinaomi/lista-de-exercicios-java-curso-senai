package listaexercicios01;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int i = 1;

        int cont = 0;

        do {
            System.out.print("Digite um número maior que 0: ");
            num = input.nextInt();
        } while(num <= 0);

        if(num == 1) {
            System.out.println("Número 1 não é primo.");
        } else {
            while(i <= num) {
                if(num % i == 0) {
                    cont++;
                }
                i++;
            }
            if(cont == 2) {
                System.out.printf("O número %d é PRIMO", num);
            } else {
                System.out.printf("O número %d não é PRIMO", num);
            }

        }


    }
}
