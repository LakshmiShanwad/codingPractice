package stringCoding;

import java.util.ArrayList;

public class StringText {
	
	static void reverseArray(char arr[],int start, int end)
	{
		while(start<end)
		{
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
	}
		
		static  void rotates(char arr[], int d, int n)
		{
			reverseArray(arr,0,n-1);
			reverseArray(arr,0,d-1);
			reverseArray(arr,0,n-1);
			
		}
		
		static void print(char arr[],int n)
		{
			for(int i =0 ; i<n;i++)
			{
				System.out.print(arr[i]);
			}
			System.out.print(" ");
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		String a = "tab bat hatis much";
		String temp[] = a.split(" ");
		int size = temp.length;
		int pos = 0;
		char c[] = null;
		for (int i = 0; i < temp.length; i++) {
			c = temp[i].toCharArray();
			for (int j = 0; j < c.length; j++)
				if(c[j]=='t')
				{
					 pos=j;
					//System.out.println(pos);
					
				}
			
			
			rotates(c, pos, c.length);
			print(c, c.length);
		}
		

		
		

	}
}
