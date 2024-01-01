package listaexercicios01;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if(num == 0) {
            System.out.println("Número 0.");
        } else if (num % 2 == 0){
            System.out.printf("O número %d é PAR", num);
        } else {
            System.out.printf("O número %d é ÍMPAR", num);
        }
    }
}
