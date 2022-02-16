package exercicio_04;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de repetições: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++ ) {
			
			System.out.println("Digite o primeiro valor: ");
			int n1 = sc.nextInt();
			System.out.println("Digite o segundo valor: ");
			int n2 = sc.nextInt();
			
			if (n2 == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double resul = (double) n1 / n2;
				System.out.printf("%.1f\n" , resul);
			}
		}
		
		sc.close();

	}

}
