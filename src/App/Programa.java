package App;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Comparar;
import entidades.Individual;
import entidades.Contribuinte;
public class Programa {

	public static void main(String[] args)throws ParseException {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<Contribuinte> list = new ArrayList<>();
	
	System.out.print("Insira o número de contribuintes: ");
	int n = sc.nextInt();
	
	for (int i=1; i<=n; i++) {
		System.out.println("contribuinte #" + i + " dados:");
		System.out.print("Pessoa física ou empresa (i/c)? ");
		char type = sc.next().charAt(0);
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Rendimento anual: ");
		double renda = sc.nextDouble();
		if (type == 'i') {
			System.out.print("Despesas de saúdes: ");
			double despesasSaúde = sc.nextDouble();
			list.add(new Individual(nome, renda, despesasSaúde));
		}
		else {
			System.out.print("Número de empregados: ");
			int numeroDeEmpregados = sc.nextInt();
			list.add(new Comparar(nome, renda,numeroDeEmpregados));
		}
	}

	double sum = 0.0;
	System.out.println();
	System.out.println("IMPOSTOS PAGOS:");
	for (Contribuinte tp : list) {
		double tax = tp.tax();
		System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tax));
		sum += tax;
	}
	//System.out.println();
	System.out.println("TOTAL DE IMPOSTOS: $ " + String.format("%.2f", sum));
	
	sc.close();
	}

}
