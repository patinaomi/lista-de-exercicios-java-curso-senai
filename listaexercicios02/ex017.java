package listaexercicios02;

public class ex017 {
    public static void main(String[] args) {
        int[] vetor = new int[15];

        for(int i=0; i<15; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
        }

        for(int i=0; i<15; i++) {
            System.out.printf("[%d] ", vetor[i]);
        }

        // vetor = [(i + 5 * i) % (i + 1) for i in range(15)]

    }
}
