package testPackage;

import java.util.Scanner;

public class Factorial {

	public static int fact(int n) {

		int num= 3;
		int fact1 =1 ;
		while(num!=0)
		{
			fact1=fact1*num;
			num--;
			
		}
		//System.out.println(" the factorial is >> " + fact1);
		return fact1;
	}

	public static void main(String args[]) {
		Scanner objscn = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ");
		int num1 = objscn.nextInt();
		//fact(num1);
		System.out.println(" the factorial is >> :) :)  " + fact(num1));
		
	}
}
