import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);

        int numeroUm, numeroDois, prod;

        System.out.println("Digite o numero A: "); 
        numeroUm = scanner.nextInt();
        
        System.out.println("Digite o numero B: "); 
        numeroDois = scanner.nextInt();

        prod = numeroUm * numeroDois;

        System.out.println("O Produto de " + numeroUm + " e " + numeroDois + " é = " + prod);

    }
}
