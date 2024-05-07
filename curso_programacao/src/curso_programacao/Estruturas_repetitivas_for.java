package curso_programacao;

import java.util.Scanner;
import java.util.Locale;

public class Estruturas_repetitivas_for {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int quadrado;
		int cubo;
		
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print(i + " ");
			quadrado = i * i;
			System.out.print(quadrado + " ");
			cubo = i * i * i;
			System.out.println(cubo + " ");
		}
		
		sc.close();
	}
}
