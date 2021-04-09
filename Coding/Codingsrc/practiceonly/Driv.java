package practiceonly;

class UserDefine extends RuntimeException {

	UserDefine(String msg) {
		super("msg");
	}

	void exceptionthrow() {
		System.out.println(" can not divide by zero numeric ");
	}
}

public class Driv extends UserDefine {

	Driv(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Integer j = new Integer(20);
		Integer k = new Integer(i.intValue() + j.intValue());
		System.out.println("Output: " + k);
		if (5 > 0) {
			throw new UserDefine("You can not vote");
		}

	}

}
