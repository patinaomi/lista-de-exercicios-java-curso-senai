package listaexercicios02;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somaMenor = 0, somaMaior = 0, idade = 0;

        do {
            System.out.print("Digite uma idade: ");
            idade = input.nextInt();

            if (idade == 0) {
                 break;
            }
            if(idade > 0 && idade < 21) {
                somaMenor++;
            }
            if(idade > 50) {
                somaMaior++;
            }

        } while(idade > 0);

        System.out.println("O total de pessoas com menos de 21 anos: " + somaMenor);
        System.out.println("O total de pessoas com mais de 50 anos: " + somaMaior);
    }
}
