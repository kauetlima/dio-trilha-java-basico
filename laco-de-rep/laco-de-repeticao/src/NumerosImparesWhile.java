/**************************
 Programa em Java que mostra os números ímpares
Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.
***************************/
import java.util.Scanner;

public class NumerosImparesWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero: ");
        int numeros = scanner.nextInt();
        
        int numeroSub = numeros;
        
        while (numeroSub > 0){
            
            if (numeroSub % 2 == 1){
            System.out.println("Numero Impar: " + numeroSub);
            }
            
            numeroSub -- ;
        }
    
        scanner.close();
    }

}