package listaexercicios01;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valor = input.nextDouble();

        if(valor >= 50) {
            double novoValor = valor - (valor * 0.10);
            System.out.printf("Valor original: R$%.2f\nNovo valor com desconto: R$%.2f", valor, novoValor);
        } else {
            System.out.println("Não há desconto para este produto.");
        }
    }

}