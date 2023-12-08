package Generation;

import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticao1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		int n1 = sc.nextInt();
		System.out.print("\nDigite o último número do intervalo: ");
		int n2 = sc.nextInt();
		
		if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}
		}
		else {
			System.out.println("Intervalo inválido!");
		}
		
		sc.close();

	}

}
