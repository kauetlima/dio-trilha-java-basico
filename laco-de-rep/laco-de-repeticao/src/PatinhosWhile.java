/**************************
0. Programa em Java dos patinhos da Xuxa
Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:

n patinhos foram passear
Além das montanhas
Para brincar
A mamãe gritou: Quá, quá, quá, quáMas só n-1 patinhos voltaram de lá.


Que se repete até nenhum patinho voltar de lá.
Ao final, todos os patinhos voltam:

A mamãe patinha foi procurar
Além das montanhas
Na beira do mar
A mamãe gritou: Quá, quá, quá, quá
E os n patinhos voltaram de lá.

Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela, onde o inteiro recebido representa o número inicial n de patinhos que foram passear.
***************************/
import java.util.Scanner;

public class PatinhosWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos patinhos foram passear: ");
        int patinhos = scanner.nextInt();
        int totalPatinhos = patinhos;
        
        while (patinhos > 0){
        System.out.println(patinhos-- + " patinhos foram passear");
        System.out.println("Além das montanhas");
        System.out.println("Para brincar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá Mas só " + (patinhos) + " patinhos voltaram de lá.");
         
    }
        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("E os "+ totalPatinhos + " patinhos voltaram de lá..");
        scanner.close();
    }
}