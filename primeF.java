package test;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		
		int a, b, primeF=1;
		try (Scanner user_input = new Scanner( System.in )) {
			System.out.print("Enter Two Numbers ");
			a  = user_input.nextInt( );
			b = user_input.nextInt( );
		}
		
		
				for(int i=2; i<=a; i++) 
				{
					if(a%i==0 && b%i==0) 
					{
						 a=a/i;
					     primeF=i;
					}
				}
		if(primeF==1) 
		{
			System.out.println("there is no prime factor");
			
		}
		else
		{
			System.out.println(primeF + " is the greatest prime factor");
		}
		
	}
	}
	
