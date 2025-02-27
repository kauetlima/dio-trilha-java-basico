import java.util.Locale;
import java.util.Scanner;

public class   Calculadora{
    public static void main (String[] args) {
    
    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

    System.out.println("Digite o primeiro numero");
    double numeroUm = scanner.nextDouble();

    System.out.println("Digite o segundo numero");
    double numeroDois = scanner.nextDouble();

    System.out.println("A soma dos numeros é:" + somar(numeroUm, numeroDois));

    scanner.close();
}
    public static double somar (double numeroUm, double numeroDois){
        return numeroUm+numeroDois;
    }

}
