/*
Programa em Java dos patinhos da Xuxa

Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:

n patinhos foram passear
Além das montanhas
Para brincar
A mamãe gritou: Quá, quá, quá, quá
Mas só n-1 patinhos voltaram de lá.


Que se repete até nenhum patinho voltar de lá.
Ao final, todos os patinhos voltam:

A mamãe patinha foi procurar
Além das montanhas
Na beira do mar
A mamãe gritou: Quá, quá, quá, quá
E os n patinhos voltaram de lá.

Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela, onde o inteiro recebido representa o número inicial n de patinhos que foram passear.
*/

import java.util.Scanner;

public class Patinhos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de patinhos: ");
        int patinhos = scanner.nextInt();
        
        for (int x = patinhos; x > 0; x--) {
            System.out.println(x + " patinhos foram passear");
            System.out.println("Além das montanhas ");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            System.out.println("Mas só " + (x - 1) + " patinhos voltaram de lá.\n");
        }
        
        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas ");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + patinhos + " patinhos voltaram de lá.\n");
        
        scanner.close();
    }
}