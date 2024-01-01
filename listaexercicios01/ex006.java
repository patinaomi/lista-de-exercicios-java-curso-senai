package listaexercicios01;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if(num == 0) {
            System.out.println("Número nulo.");
        }
        else if(num % 3 == 0) {
            System.out.printf("O número %d é múltiplo de 3.", num);
        } else {
            System.out.printf("O número %d não é múltiplo de 3.", num);
        }
    }
}
