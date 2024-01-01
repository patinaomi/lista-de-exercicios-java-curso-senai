package listaexercicios01;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor em real: ");
        double real = input.nextDouble();
        System.out.print("Qual a cotação do dólar no dia: ");
        double dolar = input.nextDouble();

        double conversao = real / dolar;

        System.out.printf("R$%.2f em dólares: U$%.2f", real, conversao);
    }
}
