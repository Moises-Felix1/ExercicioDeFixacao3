package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------------------------------------");
		System.out.println("EXERCICIO DE FIXAÇÃO CLASSES & METODOS ABSTRATOS");
		System.out.println("------------------------------------------------");
		
		List<Pessoa> listap = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int numberp = sc.nextInt();
		
		for(int i = 0; i < numberp; i++) {
			System.out.println("Tax payer #"+(i+1)+" data:");
			System.out.print("Individual or company (i/c)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(answer == 'i') {
				System.out.print("Health expenditures: ");
				double expenditures = sc.nextDouble();
				Pessoa pf = new PessoaFisica(name, income, expenditures);
				listap.add(pf);
			}else {
				if(answer == 'c') {
					System.out.print("Number of employees: ");
					int numberEmp = sc.nextInt();
					listap.add(new PessoaJuridica(name, income, numberEmp));
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("TAXES PAID:");
		double soma = 0.0;
		for(Pessoa pessoa : listap) {
			System.out.printf("%s: $ %.2f\n", pessoa.getName(), pessoa.taxesPay());
			soma += pessoa.taxesPay();
		}
		
		System.out.println();
		
		System.out.println("TOTAL TAXES: $ "+soma);
		
		sc.close();
	}

}
