import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome completo: ");
        String nome = scanner.nextLine().toUpperCase();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        Integer conta = scanner.nextInt();
        System.out.println("Por favor, digite o saldo: ");
        Double saldo = scanner.nextDouble();
        scanner.close(); //fecha o scanner

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo é R$ %.2f. Já está disponível para saque.%n", nome, agencia, conta, saldo);

    }
}
