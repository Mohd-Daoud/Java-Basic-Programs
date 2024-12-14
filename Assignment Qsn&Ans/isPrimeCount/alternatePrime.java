package isPrimeCount;

import java.util.Scanner;

public class alternatePrime {
	public void alternateNo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Last Number : ");
		int i , a;
		int number = sc .nextInt();
		int Count=0; 
		for(i = 1; i <= number ; i++)
		{
			for (a = 2; a<=i; a++)
			{
				if(i%a==0)
					continue;
			}
			if(i!=a)
			{
				System.out.print(i+ " ");
				Count++;
			}
			
		}
		System.out.println("\nTotal Prime Numbers Are : "+Count);
	}

	public static void main(String[] args) {
		System.out.println("isPrime Program is started");
		PrimeCount pc = new PrimeCount();
		pc.isPrime();
	}
}