/**************************
6. Achando os dois maiores números

Escreva um programa em Java que solicita 10 números ao usuário, através de um laço for, e ao final
mostre os dois maiores números digitados pelo usuário.
***************************/
import java.util.Scanner;

public class DoisMaioresNumeros
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    double memoria = 0;
	    double segundoMaior=0;
	    
	    System.out.println("Digite quantos numeros deseja verificar : ");
	    int listaNumeros = scanner.nextInt();
	    double numeros[] = new double[listaNumeros];
        
	    for (int x = 0 ; x < listaNumeros; x++ ){
	    
	    System.out.println("Digite o numero " + (x+1) +" : ");
        numeros [x] = scanner.nextDouble();
        
    if (numeros[x] > memoria) {
                segundoMaior = memoria;
                memoria = numeros[x];
    } 
    else if (numeros[x] > segundoMaior && numeros[x] != memoria) 
                segundoMaior = numeros[x];

	    }
	    System.out.println("O maior numero que foi digitado é :" + memoria);
		System.out.println("O  segundo maior numero que foi digitado é :" + segundoMaior);
	scanner.close();
}
}