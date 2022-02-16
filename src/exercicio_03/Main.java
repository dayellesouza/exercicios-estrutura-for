package exercicio_03;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double n1, n2, n3, resultado;
		
		
		for(int i = 0; i < n; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			resultado = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 +5);
			System.out.printf("%.1f\n" , resultado);
		}
		
		sc.close();

	}

}
