package listaexercicios01;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float menorAltura = 0, maiorAltura = 0;

        for(int i = 1; i<=5; i++) {
            System.out.printf("Digite a altura da %dº pessoa: ", i);
            float altura = input.nextFloat();

            if(i==1) {
                menorAltura = altura;
                maiorAltura = altura;
            } else {
                if(altura > maiorAltura) {
                    maiorAltura = altura;
                }
                if(altura < menorAltura) {
                    menorAltura = altura;
                }
            }
        }
        System.out.printf("Menor altura do grupo: %.2f\n", menorAltura);
        System.out.printf("Maior altura do grupo: %.2f", maiorAltura);
    }
}
