package CodingPlatform;

public class MinimumDeletionCosttoAvoidRepeatingLetters {

	public static int costofdeletion(String s, int[] cost) {
		int totalCost = 0;
		char prev = s.charAt(0);
		int maxCost = cost[0];
		int currenttotalCost = cost[0];
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			int curCost = cost[i];
			if (c == prev) {
				maxCost = Math.max(maxCost, curCost);
				currenttotalCost += curCost;

			} else {
				totalCost += currenttotalCost - maxCost;
				prev = c;
				maxCost= curCost;
				currenttotalCost= curCost;
			}
		}

		totalCost+=currenttotalCost-maxCost;
		return totalCost;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
