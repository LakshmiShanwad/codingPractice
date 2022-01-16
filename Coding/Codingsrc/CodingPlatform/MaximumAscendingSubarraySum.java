package CodingPlatform;

/*Given an array of positive integers nums,return the maximum possible sum of an ascending subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.

A subarray[nums_l,nums_(l+1),...,nums_(r-1),nums_r]is ascending if for all i where l<=i<r,nums_i<nums_(i+1).Note that a subarray of size 1 is ascending.
*/
public class MaximumAscendingSubarraySum {

	static int maxsummethod(int nums[]) {

		int maxSum = nums[0];
		int sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				sum += nums[i];

			} else
				sum = nums[i];
			maxSum = Math.max(maxSum, sum);

		}

		return maxSum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {10,20,30,5,10,50};
		System.out.println(maxsummethod(nums));

	}

}
