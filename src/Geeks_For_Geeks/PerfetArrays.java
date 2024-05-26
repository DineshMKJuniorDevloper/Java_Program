package Geeks_For_Geeks;

import java.util.Arrays;

public class PerfetArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * n = 5 arr = {1, 2, 3, 2, 1}
		 * Output : PERFECT Explanation: Here we can see we
		 * have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1] which is
		 * the same as before.So, the answer is PERFECT.
		 */
		
		//int ar[] = {1,2,3,4,5};
		int ar[] = {1,2,3,2,1};
		int emp[] = new int[ar.length];
		
		for(int i=ar.length-1;i>=0;i--)
		{
			emp[i] = ar[ar.length-1-i];
			
		}
		System.out.println(Arrays.toString(emp)+" ");
		
		if(Arrays.equals(ar, emp))
		{
			System.out.println("PERFECT");
		}
		else
		{
			System.out.println("NOT PEFECT");
		}
	}

}
