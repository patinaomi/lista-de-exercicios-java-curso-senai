package listaexercicios02;

import java.util.Scanner;
public class ex027 {
    public static void somar(float a, float b) {
        float resultado = a + b;
        System.out.println("--- SOMAR ---");
        System.out.printf("%.2f + %.2f = %.2f", a, b, resultado);;
    }
    public static void subtrair(float a, float b) {
        float resultado = a - b;
        System.out.println("--- SUBTRAIR ---");
        System.out.printf("%.2f - %.2f = %.2f", a, b, resultado);
    }
    public static void multiplicar(float a, float b) {
        float resultado = a * b;
        System.out.println("--- MULTIPLICAR ---");
        System.out.printf("%.2f X %.2f = %.2f", a, b, resultado);
    }
    public static void dividir(float a, float b) {
        float resultado = a / b;
        System.out.println("--- DIVIDIR ---");
        System.out.printf("%.2f / %.2f = %.2f", a, b, resultado);
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("*--*--* CALCULADORA *--*--*");
        System.out.println("[1] SOMAR");
        System.out.println("[2] SUBTRAIR");
        System.out.println("[3] MULTIPLICAR");
        System.out.println("[4] DIVIDIR");
        System.out.print("Escolha uma opção: ");
        int op = input.nextInt();

        System.out.print("Digite o primeiro número: ");
        float a = input.nextFloat();
        System.out.print("Digite o segundo número: ");
        float b = input.nextFloat();

        switch (op) {
            case 1:
                somar(a, b);
                break;

            case 2:
                subtrair(a, b);
                break;
            case 3:
                multiplicar(a, b);
                break;
            case 4:
                dividir(a, b);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    public static void main(String[] args) {
        ex027 e1 = new ex027();
        e1.menu();
    }
}
