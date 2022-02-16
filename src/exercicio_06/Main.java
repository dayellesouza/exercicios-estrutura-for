package exercicio_06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int resul = num % i;
			
			if (resul != 0) {
				i++;
			} else {
				System.out.println(i);
			}
		}
		
		
		sc.close();

	}

}
