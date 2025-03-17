/**************************

7. Quadrado de asteriscos

Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos. Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
Para lado igual a 5:
***
***
***
***
***
***************************/
import java.util.Scanner;

public class QuadradoAsterisco {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do quadrado de * desejado: ");
        int tamanho = scanner.nextInt();
        
        for (int x = 0; x < tamanho; x++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("*"); // Imprime os asteriscos na mesma linha
            }
            System.out.println(); // Pula para a próxima linha após cada linha de asteriscos
        }
        
        scanner.close();
    }
}