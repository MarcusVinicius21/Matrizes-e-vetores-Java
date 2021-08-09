package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] N1 = new int[4][6];
		int[][] N2 = new int[4][6];
		int[][] M1 = new int[4][6];
		int[][] M2 = new int[4][6];
		
		for(int A = 0; A < 4; A++) {
			for(int B = 0; B < 6; B++) {
				System.out.println("Digite os números de N1: ");
				N1[A][B] = entrada.nextInt();
				System.out.println("Digite os números de N2: ");
				N2[A][B] = entrada.nextInt();
				N1[A][B]=1+(int)(Math.random()*50);
				N2[A][B]=1+(int)(Math.random()*50);
				
				M1[A][B] = N1[A][B] + N2[A][B];
				M2[A][B] = N1[A][B] - N2[A][B];				
			}
			
		}
		System.out.println("M1=  \n");
		for(int A = 0; A < 4; A++) {
			for(int B = 0; B < 6; B++) {
				System.out.println("[ " + M1[A][B] + " ]");
			}
			System.out.println("\n");
		}
		System.out.println("M2=  \n");
		for(int A = 0; A < 4; A++) {
			for(int B = 0; B < 6; B++) {
				System.out.println("[ " + M2[A][B] + " ]");
			}
			System.out.println("\n");
		}
		
	}

}

	