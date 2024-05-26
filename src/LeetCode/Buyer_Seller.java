package LeetCode;

public class Buyer_Seller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] ar= {7,1,5};
	int sum;

	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]<ar[j])
			{
				sum = ar[i]-ar[j];
				System.out.println(sum+" profit");
			}
			else
			{
				System.out.println("loss");
			}
		}
	}
	
	
		
	
	
	
	
	}

}
