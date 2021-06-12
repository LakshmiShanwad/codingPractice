package codingpackage;

import java.util.Scanner;

import codingpackage.ztestprac.CustomExe;

// this is parent class 
class ztestprac {

	class CustomExe extends Exception {

		CustomExe(String s)
		{
			super(s);
		}
		
	}

	public void containsDuplicate() throws CustomExe {
		int a = 11;
		if (a > 10) {
			 
				throw new CustomExe("Age should be less than 10");
			
		}

	}

	public static void main(String args[]) throws CustomExe {

		ztestprac o = new ztestprac();
				o.containsDuplicate();
				
				Scanner sc = new Scanner(System.in);
				Object a = sc.next();
				
			
				 
	}

}
