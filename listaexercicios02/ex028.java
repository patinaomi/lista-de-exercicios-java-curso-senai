package listaexercicios02;

import java.util.Scanner;

public class ex028 {
    public static void pontenciacao(int base, int expoente) {
        double resultado = Math.pow(base, expoente);

        System.out.println("--- RESULTADO ---");
        System.out.printf("%d elevado a %d = %.0f", base, expoente, resultado);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = input.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = input.nextInt();

        pontenciacao(base, expoente);

    }
}
