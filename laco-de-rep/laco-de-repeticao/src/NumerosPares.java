/*
Programa em Java que mostra os números pares
Escreva um aplicativo em Java mostra todos os números pares de 1 até 100.
*/

public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números ímpares de 1 a 100:");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // Verifica se o número é ímpar
                System.out.println(i);
            }
        }
    }
}