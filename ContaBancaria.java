import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
    private String nome;
    private String tipoConta;
    private int numConta;
    private double saldo;

    LocalDateTime dataHora = LocalDateTime.now();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
    String dataFormatada = dataHora.format(formatador);

    public ContaBancaria() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void criarConta() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        this.setNome(input.nextLine());

        int op = 0;
        while(true) {
            System.out.println("Selecione o tipo de conta ");
            System.out.println("[1] Conta Corrente");
            System.out.println("[2] Conta Poupança");
            op = input.nextInt();
            if (op == 1) {
                this.setTipoConta("Corrente");
                break;
            }
            if (op == 2) {
                this.setTipoConta("Poupança");
                break;
            } else {
                System.out.println("Opção Inválida");
            }
        }
        this.setNumConta((int) (Math.random() * 10000));
        this.setSaldo(0);
    }
    public void imprimirDados() {
        System.out.println(dataFormatada);
        System.out.printf("Nome: %s%n", getNome());
        System.out.printf("Conta: %d - Conta %s%n", getNumConta(), getTipoConta());
        System.out.printf("Saldo Atual: R$%.2f%n", getSaldo());
    }

    public void fazerTransferencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor que deseja transferir: ");
        float valor = input.nextFloat();

        if(this.saldo < valor) {
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Transferência realizada com sucesso");
            System.out.printf("Saldo atualizado: R$%.2f%n", this.saldo);
        }
    }

    public void fazerDeposito() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor que deseja fazer depósito: ");
        float valor = input.nextFloat();

        if(valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo += valor;
            System.out.println("Depósito realizada com sucesso");
            System.out.printf("Saldo atualizado: R$%.2f%n", this.saldo);
        }
    }
}
