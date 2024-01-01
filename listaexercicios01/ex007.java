package listaexercicios01;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        float peso = input.nextFloat();
        System.out.print("Digite sua altura: ");
        float altura = input.nextFloat();

        float imc = peso / (altura * altura);

        if(imc <= 18.5) {
            System.out.println("Classificação: Baixo Peso");
        } else if (imc <= 24.99) {
            System.out.println("Classificação: Peso Normal");
        } else if (imc <= 29.99) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }
    }
}
