package Pattern;

public class Pattern_9017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		for(int i=0;i<5;i++)
		{
			 n =i+(i+1);
			for(int j=1;j<=5;j++)
			{
				
				System.out.print(" "+n+" ");
				n = n+2;
			}
			
			System.out.println();
		}
		
	}

}
/*
 *  1  3  5  7  9
 *  3  5  7  9  11
 *  5  7  9  11 13
 *  7  9  11 13 15
 *  9  11 13 15 17
 *  
 * 
 * 
 * 
 * 
 */ 

