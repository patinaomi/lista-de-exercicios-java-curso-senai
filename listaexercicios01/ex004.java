package listaexercicios01;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        float celsius = input.nextFloat();
        float fahrenheit = (float) ((celsius * 1.8) + 32);

        System.out.printf("Temperatura em Celsius: %.1fCº\n" +
                "Temperatura em Fahrenheit %.1f", celsius, fahrenheit);
    }
}
