package listaexercicios02;
import java.util.Scanner;
public class ex009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[15];
        int[] vetorInvertido = new int[15];

        for(int i=0; i<vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            vetor[i] = input.nextInt();
        }

        for(int i=14; i >= 0; i--) {
            vetorInvertido[14-i] = vetor[i];
        }

        System.out.println("Vetor original");
        for(int i = 0; i<vetor.length; i++) {
            System.out.printf("[%d]",vetor[i]);
        }

        System.out.println("\nVetor invertido");
        for(int i = 0; i<vetor.length; i++) {
            System.out.printf("[%d]",vetorInvertido[i]);

        }

    }
}
