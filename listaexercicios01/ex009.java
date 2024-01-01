package listaexercicios01;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();

        if(idade >= 18) {
            System.out.println("Você é penalmente responsável");
        } else {
            System.out.println("Você não é penalmente responsável");
        }
    }
}
