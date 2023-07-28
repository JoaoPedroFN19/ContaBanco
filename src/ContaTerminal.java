import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitação dos dados via terminal
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Consumir o caractere de nova linha após o próximoInt()

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        Double saldo = sc.nextDouble();

        // Exibição das informações inseridas
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo é " + saldo + " já está disponível para saque.");
    }
}
