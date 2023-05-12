package CalcImc;

import java.util.Scanner;

public class CalculadorImc {

	public static void main(String[] args) {
		
		// Cria um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		// Cabeçalho do app
		System.out.println("Calculadora de IMC");
		System.out.println("");
		
		// Pede ao usuário para inserir a altura
		System.out.println("Digite sua Altura !");
		double altura = scanner.nextDouble();
		
		// Pede ao usuário para inserir o peso
		System.out.println("Digite seu Peso !");
		int peso = scanner.nextInt();
		
		 // Calcula o índice de massa corporal (IMC)
		double total = peso / (altura * altura);
		
		// Arredonda o resultado do IMC para duas casas decimais
		double totalArredondado = Math.round(total * 100.0) / 100.0;
		
		 // Exibe a classificação de peso com base no IMC
		if ( totalArredondado < 18.5) {
			System.out.println("Abaixo do Peso: " + totalArredondado);
		} else if (totalArredondado < 24.9) {
			System.out.println("Peso Normal: " + totalArredondado);
		} else if (totalArredondado < 29.9) {
			System.out.println("Sobrepeso: " + totalArredondado);
		} else if (totalArredondado < 34.9) {
			System.out.println("Obesidade grau 1: " + totalArredondado);
		} else if (totalArredondado < 39.9) {
			System.out.println("Obesidade grau 2: " + totalArredondado);
		} else {
			System.out.println("Obesidade grau 3: " + totalArredondado);
		}

	}

}
