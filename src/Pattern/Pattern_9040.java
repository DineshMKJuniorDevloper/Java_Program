package Pattern;

public class Pattern_9040 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			int n =2;
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				n= n+2;
			}
			System.out.println();
		}

	}

}
/*
    2 
	2 4 
	2 4 6 
	2 4 6 8 
	2 4 6 8 10 

*/