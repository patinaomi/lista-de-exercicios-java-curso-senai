package listaexercicios01;

import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o lado A do triângulo: ");
        int ladoA = input.nextInt();
        System.out.print("Digite o lado B do triângulo: ");
        int ladoB = input.nextInt();
        System.out.print("Digite o lado C do triângulo: ");
        int ladoC = input.nextInt();

        //pra formar um triângulo, a soma de dois lados tem que ser sempre menor que o terceiro lado

        if(ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoA + ladoB) {
            System.out.println("Os valores formam um triângulo");
        } else {
            System.out.println("Os valores não formam um triângulo");
        }



    }
}
