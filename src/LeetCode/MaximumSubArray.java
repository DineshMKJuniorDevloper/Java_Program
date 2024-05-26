package LeetCode;

public class MaximumSubArray {

	public static void main(String[] args) {
		/*
		 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4] 
		 * Output: 6 Explanation: The subarray
		 * [4,-1,2,1] has the largest sum 6.
		 */
		
		int num[]= {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum=num[0];
		int max =num[0];
		
		for(int i=1;i<num.length;i++)
		{
			sum = Math.max(num[i], sum + num[i]);
			max = Math.max(max, sum);		
		 }
		
		
		}
			
	}

