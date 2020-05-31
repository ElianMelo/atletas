package atletas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome, nomeAlto;
		char sexo, outro;
		Double altura, maisAlto, peso, pesoMedio, altMulher;
		int count, homem;
		nomeAlto = "";
		count = homem = 0;
		pesoMedio = maisAlto = altMulher = 0.0;
		
		
		do {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			do {
				System.out.print("Sexo: ");
				sexo = sc.next().toUpperCase().charAt(0);
			} while (sexo != 'F' && sexo != 'M');
			if (sexo == 'M') {
				homem++;
			}
			do {
				System.out.print("Altura: ");
				altura = sc.nextDouble();
			} while(altura <= 0.0);
			if (altura >= maisAlto) {
				maisAlto = altura;
				nomeAlto = nome;
			}
			if(sexo == 'F') {
				altMulher += altura;
			}
			do {
				System.out.print("Peso: ");
				peso = sc.nextDouble();
			} while(peso <= 0.0);
			pesoMedio += peso;
			count++;
			System.out.print("Digitar outro atleta (S/N)? ");
			outro = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
		} while(outro != 'N');
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio / count);
		System.out.println("Atleta mais alto: " + nomeAlto);
		System.out.printf("Porcentagem de homens: %.1f %%%n", (double) ((double) homem / (double) count) * 100.0);
		System.out.printf("Altura média das mulheres: %.2f%n", (double) altMulher / (double) (count - homem));
		System.out.println();
		System.out.println("FIM DO PROGRAMA!");
		sc.close();
	}

}
