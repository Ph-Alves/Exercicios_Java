package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n,m;
		System.out.print("Digite o número de linhas da matriz: ");
		n = sc.nextInt();
		System.out.print("Digite o número de colunas da matriz: ");
		m = sc.nextInt();
		int[][] mat = new int[n][m];
		System.out.println("Digite os números das matrizes: ");
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int numPesq;
		System.out.print("Digite o número que quer pesquisar: ");
		numPesq = sc.nextInt();
		
		int esquerda,direita,acima,abaixo;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if (numPesq == mat[i][j]) {
					System.out.printf("Posição %d,%d :\n", i,j);
					if(j > 0) {
						esquerda = mat[i][j-1];
						System.out.println("Esquerda: " + esquerda);
					}
					if(i > 0) {
						acima = mat[i-1][j];
						System.out.println("Acima: " + acima);
					}
					if(j < mat[i].length-1) {
						direita = mat[i][j+1];
						System.out.println("Direita: " + direita);
					}
					if(i < mat.length) {
					abaixo = mat[i+1][j];
					System.out.println("Abaixo: " + abaixo);
					}
				}
			}
		}
		
		sc.close();
	}

}
