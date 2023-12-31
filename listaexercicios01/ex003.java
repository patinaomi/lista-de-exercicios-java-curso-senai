package listaexercicios01;

import java.util.Scanner;

public class ex003 {
    ex001 c1 = new ex001();

    public void novoMenu() {
        int op = 0;
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("+-------------------------+");
            System.out.println(" ***** BANCO DA JAPA ***** ");
            System.out.println("+-------------------------+");
            System.out.println("| [1] Criar Conta          |");
            System.out.println("| [2] Tirar Extrato        |");
            System.out.println("| [3] Fazer Transferência  |");
            System.out.println("| [4] Realizar Depósito    |");
            System.out.println("| [0] Sair do App          |");
            System.out.println("+-------------------------+");
            System.out.print("Selecione uma Opção: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    c1.criarConta();
                    break;
                case 2:
                    c1.imprimirDados();
                    break;
                case 3:
                    c1.fazerTransferencia();
                    break;
                case 4:
                    c1.fazerDeposito();
                    break;
                case 0:
                    System.out.println("Saindo do App...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida, digite novamente.");
            }
        }
    }
}
