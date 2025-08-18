package view;

import java.util.Scanner;
import controller.SomatoriaController;

// Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
// inteiro (N), apresente a saída da somatória

public class main {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		SomatoriaController SomatoriaController = new SomatoriaController();
		
		System.out.println("Digite um número inteiro: ");
		int n = in.nextInt();
		
		double result = SomatoriaController.somatoria(n);
		
		System.out.println("O valor da somatoria e: " + result);
	}

}
