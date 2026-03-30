import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o seu numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.printf("Digite a sua agencia: ");
        String agencia = sc.nextLine();
        System.out.printf("Digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.printf("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");

    }
}
