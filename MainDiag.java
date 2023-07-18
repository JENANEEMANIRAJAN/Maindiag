package mainDia;

import java.util.Scanner;

public class MainDiag {
	public static int diag(int arr[][], int a) {
		int sum = 0; 
		for (int j=0; j<a; j++) {
			sum = sum + arr[j][j];
		}
		return sum;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int arr[][] = new int[a][a];
	for(int i=0; i<a; i++) {
		for (int j=0; j<a; j++) {
			
		arr[i][j] = sc.nextInt();
		
		}
		
	}
	int val = diag(arr, a);
			System.out.println(val);

	}

}
