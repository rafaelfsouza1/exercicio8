package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);;
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();	
			}
		}
		
		int x = sc.nextInt();
		
		dados(mat, x);
		
		sc.close();
	}
	
	public static void dados(int mat[][], int x) {
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				
				if(mat[i][j] == x) {
					
					String position = i+","+j;
					System.out.println("Position: " + position);
					if(j > 0) {
						int left = mat[i][j-1];
						System.out.println("Left: " + left);
					}
					if(j < mat[i].length - 1) {
						int right = mat[i][j+1];
						System.out.println("Right: " + right);
					}
					if(i > 0) {
						int up = mat[i-1][j];
						System.out.println("Up: " + up);
					}
					if(i < mat.length - 1) {
						int down = mat[i+1][j];
						System.out.println("Down: " + down);
					}
				}
			}
		}	
	}

}
