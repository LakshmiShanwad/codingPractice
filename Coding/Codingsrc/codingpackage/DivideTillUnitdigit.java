package codingpackage;

public class DivideTillUnitdigit {
	
	 
	static int unitSum(int input) { 
		int tsum=0;
		while (input != 0) {
			tsum = tsum + input % 10;
			input = input / 10;// 123
			
	/*		if(input==0)
			{
				input=tsum;
				tsum=0;
				
			*/
			}
		
		if (tsum >= 10) {
			unitSum(tsum);
		}
		
		return tsum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(unitSum(1234));

	}

}
