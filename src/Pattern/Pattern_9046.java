package Pattern;

public class Pattern_9046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =2;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%2d ",n);
				n = n+2;
			}
			System.out.println();
		}
	}

}
/*
     2 
	 4  6 
	 8 10 12 
	14 16 18 20 
	22 24 26 28 30
*/
