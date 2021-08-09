package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double[] nota = new double[5];
		double B=0.0;
		try (Scanner entrada = new Scanner(System.in)) {
			for(int A=0; A<=4; A++) {
				System.out.println("Digite a pontuação da atividade: ");
				nota[A] = entrada.nextDouble();
				
			if(nota[A]>B) {
				B = nota[A];
			}
				
				
			}
		}
		
		System.out.println("A maior nota é: "+ B);
	}

}