package Class;


import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[] = {10,20,30,40,50};
		Integer arr[] = {2,4,6,8,10,12};
		
		Collections.reverse(Arrays.asList(arr));
		
		System.out.println(Arrays.asList(arr));
		
		
	
		int i =0,j= ar.length-1;	
		while(i<=j)
		{
		  int temp = ar[i];
		   ar[i] = ar[j];
		   ar[j] = temp;
		   
		   i = i+1;
		   j= j-1;
		}
		
		for(int z=0;z<ar.length;z++)
		{
			System.out.print(ar[z]+" ");
		}
	}

}
