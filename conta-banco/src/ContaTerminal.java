import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        
        
        int numero;
        String agencia, nomeCliente;
        double saldo;


        System.out.println("=================================");
        System.out.println("\tCADASTRO BANCÁRIO");
        System.out.println("=================================");


        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, a agência da conta: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do proprietário da conta: ");
        nomeCliente = scanner.nextLine();
    
        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("=================================");
        System.out.println("INFORMAÇÕES DO CADASTRO");
        System.out.println("=================================");
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco."); 
        System.out.println("Sua agência é " + agencia + " conta " + numero + " e seu saldo no valor de " + saldo + " já está disponível para saque ");    
    }
}
