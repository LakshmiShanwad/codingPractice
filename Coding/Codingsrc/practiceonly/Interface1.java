package practiceonly;

public interface Interface1 {

	int a =10;
	void Imethod1();

	private void Imethod2() {
		System.out.println("Imethod2 is private");
	}

	public static void Imethod3() {
		System.out.println("Imethod3 is static and using Imethod2");
	}

	default void Imethod4() {
		Imethod2();
		System.out.println(" default Imethhod4 also using Imethod2 which is private");
	}
}
