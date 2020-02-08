package testPackage;

// this is parent class 
class ztestprac {

	void objreverse(String[] input, int start, int end) {
		String temp;

		while (start < end) {
			temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			start++;
			end--;

		}

	}

	void printarray1(String input[], int n) {
		for (int i = 0; i < n; i++)
			System.out.println("array is " + input[i]);
	}

	public static void main(String args[]) {
		ztestprac o = new ztestprac();
		String a = "ashutosh kumar";
		String input[] = a.split(" ");
		int len = input.length;
		o.printarray1(input, len);
		o.objreverse(input, 0, len-1);
		o.printarray1(input, len);

	}

}
