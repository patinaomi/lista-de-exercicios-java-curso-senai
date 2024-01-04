package listaexercicios02;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] vetor = new float[10];
        int i, contMenor = 0, contMaior = 0;
        float menorAluno = 0, maiorAluno = 0;

        for(i=0; i<10; i++) {
            System.out.printf("Digite a altura do aluno %d: ", i+1);
            vetor[i] = input.nextFloat();

            if(i == 0) {
                menorAluno = vetor[i];
                maiorAluno = vetor[i];
            } else {
                if(vetor[i] < menorAluno) {
                    contMenor = i;
                    menorAluno = vetor[i];
                }
                if(vetor[i] > maiorAluno) {
                    contMaior = i;
                    maiorAluno = vetor[i];
                }
            }
        }

        System.out.printf("Aluno mais baixo: nº%d - %.2fm",contMenor+1, menorAluno);
        System.out.printf("\nAluno mais alto: nº%d - %.2fm",contMaior+1, maiorAluno);





    }
}
