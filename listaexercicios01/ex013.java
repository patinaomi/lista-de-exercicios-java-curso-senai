package listaexercicios01;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double desconto = 0;
        double valor = input.nextDouble();

        if(valor < 50) {
            System.out.println("Não há desconto");
        } else if (valor < 100) {
            System.out.println("Desconto de 5%");
            desconto = 0.05F;
        } else if (valor < 200) {
            System.out.println("Desconto de 10%");
            desconto = 0.10F;
        } else {
            System.out.println("Desconto de 15%");
            desconto = 0.15F;
        }
        
        valor = valor - (valor * desconto);
        System.out.printf("Valor a pagar: R$%.2f", valor);
    }
}
