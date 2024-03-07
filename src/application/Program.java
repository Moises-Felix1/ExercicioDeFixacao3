package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------------------------");
		System.out.println("EXERCICIO DE FIXAÇÃO CLASSES & METODOS ABSTRATOS");
		System.out.println("------------------------------------------------");

		System.out.print("Enter the number of tax payers: ");
		int numberp = sc.nextInt();
		
		for(int i = 0; i < numberp; i++) {
			System.out.println("Tax payer #"+(i+1)+" data:");
			System.out.print("Individual or company (i/c)? ");
			char answer = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			double income = sc.nextDouble();
		}
		
		sc.close();
	}

}
