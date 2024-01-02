package listaexercicios02;

public class ex002 {
    public static void main(String[] args) {
        System.out.println("Números ímpares de 100 a 200");

        for(int i=100; i<=200; i++) {
            if(i %2 != 0) {
                if (i < 199) {
                    System.out.printf("%d - ", i);
                } else {
                    System.out.printf("%d", i);
                }
            }
        }
    }
}
