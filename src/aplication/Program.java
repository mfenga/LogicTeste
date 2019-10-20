package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a origem: ");
		String origem = sc.nextLine();
		System.out.print("Informe o destino: ");
		String destino = sc.nextLine();
		System.out.print("Inofrme a distância (KM): ");
		Double distancia = sc.nextDouble();
		sc.nextLine();
		System.out.print("Escolha o tipo de transporte (aéreo / terrestre): ");
		String transporte = sc.nextLine();
		System.out.print("Escolha a prioridade (tempo / preço): ");
		String prioridade = sc.nextLine();
		sc.close();

	}

}
