package codingpackage;

public class IgnorefromFixindex {

	// sum all by ignoring only 6 between 9th 
	static void method(int a[])
	{
		int lowIndex,highIndex,sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==6 )
			{
				lowIndex= i;
			}
			if(a[i]==9)
				highIndex=i;
			sum+=a[i];
		}
		
		
		
	}
	
	static int method1(int a[])
	{
		int i = 0, k = 0, sum = 0;
		while (i < a.length) {
			if (a[i] == 6) {
				int j=0;
				k = i;
				while (a[k] != 9) {
					k++;
					j++;

				}
				i= i+j;
				 
			} else
			{
				sum += a[i];
			i++;}

		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,6,7,9,1,6,3,9,10};
		System.out.println(method1(a));

	}

}
