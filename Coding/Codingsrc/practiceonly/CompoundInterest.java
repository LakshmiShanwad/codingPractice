package practiceonly;

public class CompoundInterest {

	protected static double calculate(double d, double e, int t, int postStop) {
		double Amt = 0;
		for (int i = 1; i <= t; i++) {
			Amt = (Amt + d) * (1 + e / 100);
		}
		if(postStop==0)
			return Amt;
		else
		return (Amt * Math.pow((1 + e / 100), postStop));
	}

	/*public static void main(String[] args) {
		// first value amount entered , rate that government is providing and then
		// time for which u keep ur fund and post that how long we keep that fund
		System.out.println(calculate(100000, 8.5, 15, 0));
	}
*/
}
