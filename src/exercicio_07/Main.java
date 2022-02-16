package exercicio_07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			System.out.printf(" %.0f" , Math.pow(i, 2));
			System.out.printf(" %.0f\n" , Math.pow(i, 3));
		}
		
		sc.close();

	}

}
