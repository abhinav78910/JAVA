package JavaPractice;

import java.util.Scanner;

public class Pattern26 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int row=1;
		int nst=1;
		int nsp=n-1;
		
		while(row<=n) {
			
			//work
			int val=1;
			int csp=1;
			while(csp<=nsp) {
				
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {

				System.out.print(val);
				val++;
				cst++;
			}
			
			
			//prep
			System.out.println();
			row=row+1;
			nst=nst+2;
			nsp=nsp-1;
			
		}

	}

}
