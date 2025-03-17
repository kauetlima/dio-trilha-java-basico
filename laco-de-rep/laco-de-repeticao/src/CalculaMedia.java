/*
Programa em Java que calcula a média das notas de uma turma

Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço for, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.

Por fim, o programa mostra a média, aritmética, da turma.
*/

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos alunos tem na sua sala : ");
        int alunos = scanner.nextInt();
        
        Double medias [] = new Double [alunos];
        double soma = 0;
        
        for (int x = 0 ; x < alunos ; x++){
        System.out.println("Digite a nota do aluno " + (x + 1) +  " :" );
         medias [x] = scanner.nextDouble();
         soma = soma + medias[x];
         
        }
        
        double mediasFinal = soma / alunos;
        System.out.println("Media final da sala: " + mediasFinal);
        
        scanner.close();
    }
}