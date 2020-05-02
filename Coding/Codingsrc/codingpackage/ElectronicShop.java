package codingpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ElectronicShop {

	public static int spentMoney() {
		List<Integer> lst = new ArrayList<Integer>();

		int usb[] = { 8, 5 };
		int pend[] = { 6, 7, 9 };
		int totalSum = 10;
		for (int i : usb) {
			for (int j : pend) {
				lst.add(i + j);

			}

		}
		Collections.sort(lst);
		if (lst.get(0) > totalSum)
			return -1;

		int ind = 0;
		for (ind = lst.size() - 1; ind >= 0; ind--)
			if (lst.get(ind) > totalSum)
				continue;
			else {
				break;
			}

		System.out.println("Total spent: " + lst.get(ind));

		return lst.get(ind);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ElectronicShop obj = new ElectronicShop();
		System.out.println(spentMoney());
	}

}
