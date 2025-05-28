package Dio.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a agencia de sua conta: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo do conta: ");
        String saldoTexto = scanner.next().replace(",",".");
        double saldo = Double.parseDouble(saldoTexto);

        System.out.println(" Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja está disponivel para saque. ");

        scanner.close();

    }
}
