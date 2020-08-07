/**
 * 
 */
package codingpackage;

/**
 * @author ashutoshksingh
 *
 */
public class PaternStairright {

	
	public static void m(int a)
	{
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(i>=j)
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
	
	static void rytstair(int a)
	{
		int c = a-1 ;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if(j<c)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
			c=c-1;
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//m(5);
		rytstair(5);
	}

}
