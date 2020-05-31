package atletas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		char sexo, outro;
		Double altura, peso;
		
		do {
			System.out.print("Nome: ");
			nome = sc.nextLine();
			do {
				System.out.print("Sexo: ");
				sexo = sc.next().toUpperCase().charAt(0);
			} while (sexo != 'F' && sexo != 'M');
			do {
				System.out.print("Altura: ");
				altura = sc.nextDouble();
			} while(altura <= 0.0);
			do {
				System.out.print("Peso: ");
				peso = sc.nextDouble();
			} while(peso <= 0.0);
			System.out.print("Digitar outro atleta (S/N)? ");
			outro = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
		} while(outro != 'N');
		
		sc.close();
	}

}
