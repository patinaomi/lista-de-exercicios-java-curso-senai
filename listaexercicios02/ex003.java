package listaexercicios02;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        System.out.println("TABUADA DO " + num);
        for(int i = 1; i<=10; i++) {
            int mult = i * num;
            System.out.printf("%d X %d = %d \n", i, num, mult);
        }
    }
}
