package Generation;

import java.util.Locale;
import java.util.Scanner;

public class LacoRepeticao2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma21 = 0, soma50 = 0;		
		
		System.out.print("Digite uma idade: ");
		int idade = sc.nextInt();			
		
		while (idade > 0) {
			if (idade < 21) {
				soma21 = soma21 + 1;
			}
			if (idade > 50) {
				soma50 = soma50 + 1;
			}
			System.out.print("Digite uma idade:");
			idade = sc.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + soma21);
		System.out.println("Total de pessoas maiores de 50 anos: " + soma50);
		
		sc.close();

	}

}
