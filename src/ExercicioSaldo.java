import java.util.Scanner;

public class ExercicioSaldo {

    public static void main(String[] args) {

        String nomeCliente = "Leandro";
        Double saldoCliente = 750.80;
        boolean contaCorrente = true;

        System.out.println("\n *************");
        System.out.println("Cliente " + nomeCliente);
        System.out.println("Saldo disponível na conta: " + saldoCliente);
        if (contaCorrente == true) {
            System.out.println("Conta corrente");
        } else {
            System.out.println("Conta poupança");
        }
        System.out.println(" **************");

        // ***************************
        Scanner scanner = new Scanner(System.in);
        int senhaConta = scanner.nextInt();
        int tentativas = 0;

        while (senhaConta != 7452) {
            System.out.println("Senha incorreta");
            tentativas++;
            System.out.println(tentativas);
        }if (tentativas == 3) {
            System.out.println("Você atingiu o limite de 3 tentativas, Conta bloqueada");
        }
    }}
