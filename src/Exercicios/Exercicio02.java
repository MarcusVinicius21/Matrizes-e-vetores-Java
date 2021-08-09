package Exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] dado = new int[60];
		int A, S = 0, MP = 0, maior = 0;
		double media;
		
		for(A=1; A <= 10; A++) {
		dado[A]=1+(int)(Math.random()*6);
		S = S + dado[A];
		
		if(dado[A] == 6){
			MP++;
		}
		if(maior < dado[A]){
			maior = dado[A];
		}
		
	}
		for(A=1; A<=10; A++) {
			System.out.println("\n"+ A + "º " + "lançamento: "+ dado[A]);
		
		}
		media=S/10.0;
		System.out.println("\nA média aritmética dos lançamentos é: " + media);
		System.out.println("\nOcorrências da maior pontuação.: " + MP);
		System.out.println("\nO maior lançamento foi de: " + maior);
	}

}
