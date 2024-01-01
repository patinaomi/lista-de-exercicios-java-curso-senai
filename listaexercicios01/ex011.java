package listaexercicios01;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if(num %5 == 0 && num % 2 ==0) {
            System.out.println("O número é par e múltiplo de 5");
        } else {
            System.out.println("O número não atende aos critérios");
        }
    }
}
