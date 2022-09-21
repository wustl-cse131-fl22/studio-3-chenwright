package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean [] isPrime = new boolean [n];
		for (int i = 0; i< isPrime.length; i++) {
			isPrime[i]=true;
		}
		for (int i = 2; i< isPrime.length; i++)
		{
			if (isPrime [i] == true) {
				for ( int x = 2*i ; x < n; x= x+i) {
					isPrime[x] = false;
				}
			}
		}
		for (int i = 2; i< isPrime.length; i++)
		{
			if (isPrime[i] == true){
				System.out.print(i + ", ");
			}
		}
			
	}

}
