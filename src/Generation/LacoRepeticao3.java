package Generation;

import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticao3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			n = sc.nextInt();
			if (n > 0) {
				soma = soma + n;
			}
		} while(n != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		sc.close();
	}
	


}
