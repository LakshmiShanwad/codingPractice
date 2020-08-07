import java.util.ArrayList;
import java.util.List;

public class ArrayMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> La = new ArrayList<Integer>();
		List<Integer> Lb = new ArrayList<>();
		La.add(1245);
		La.add(7654);
		Lb.add(5678);
		Lb.add(3515);
		int counter = 0, a1 = 1, a2 = 1;
		for (int i = 0; i < La.size(); i++) {
			int tmp1 = La.get(i);
			int tmp2 = Lb.get(i);

			while (tmp1 != 0 & tmp2 != 0) {

				a1 = tmp1 % 10;
				tmp1 = tmp1 / 10;

				a2 = tmp2 % 10;
				tmp2 = tmp2 / 10;
				int tmpabs = Math.abs(a1 - a2);
				counter = counter + tmpabs;

			}

		}
		System.out.println(counter);

	}

}
