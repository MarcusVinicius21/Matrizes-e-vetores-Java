package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] N = new int[3][3];
		int soma=0, diagonal;
		
		for(int A = 0; A < 3; A++) {
			for(int B = 0; B < 3; B++) {
				System.out.println("Digite os números da matriz: ");
				N[A][B] = entrada.nextInt();
				
				soma = soma + N[A][B];		
			}
			System.out.println("\n");
		}
		System.out.println("Matriz = \n");
		for(int A = 0; A < 3; A++) {
			for(int B = 0; B < 3; B++) {
				System.out.println("[ " + N[A][B] + " ]");
			}
			System.out.println("\n");
		}
		diagonal = N[0][0] + N[1][1] + N[2][2];
		System.out.println("\nA soma dos números inseridos é: "+ soma);
		System.out.println("\nA soma dos valores da primeira diagonal é: "+ diagonal);
		
	}

}