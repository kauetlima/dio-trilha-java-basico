/**************************
5. Achando o maior número
Achar o maior, menor, média e organizar números ou sequências são os algoritmos mais importantes e estudados em Computação. Em Java não poderia ser diferente.
Em nosso curso, obviamente, também não será diferente.

Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final
mostre qual destes números é o maior.

***************************/
import java.util.Scanner;

public class MaiorNumero
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    double memoria = 0;
	    System.out.println("Digite quantos numeros deseja verificar : ");
	    int listaNumeros = scanner.nextInt();
	    double numeros[] = new double[listaNumeros];

	    
	    for (int x = 0 ; x < listaNumeros; x++ ){
	    
	    System.out.println("Digite o numero " + (x+1) +" : ");
        numeros [x] = scanner.nextDouble();
		
		if (memoria > numeros [x])
		    memoria = memoria ;
	    else
		memoria = numeros [x];
		
		System.out.println("O maior numero que foi digitado é :" + memoria);

	    }
	    scanner.close();
	}
}