package Pattern;

public class Pattern_9045 {

	public static void main(String[] args) {
		int n = 1;
		
		for(int i=1;i<=5;i++)
		{

			for(int j=1;j<=i;j++)
			{
				System.out.printf("%2d ",n);
				n = n+2;
			}
			System.out.println();
			
		}
	}

}
/*
  1 
  3  5
  7  9  11
  13 15 17 19
  21 23 25 27 29
*/