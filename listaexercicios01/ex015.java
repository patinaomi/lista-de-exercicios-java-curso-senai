package listaexercicios01;

public class ex015 {
    public static void main(String[] args) {
        System.out.print("Soma de ímpares e múltiplos de 3: ");
        int soma = 0;
        for(int i=0; i<=500; i+=3) {
            if(i %2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
