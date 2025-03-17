/*
3. Programa em Java que mostra os números pares e ímpares 
Escreva um aplicativo em Java que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.
*/

public class ImparPar {
    public static void main(String[] args) {
        System.out.println("Números ímpares de 1 a 100:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Verifica se o número é ímpar
                System.out.println("Numero par:" + i);
            }    
                else
                System.out.println("Numero impar:" + i);
            
        }
    }
}