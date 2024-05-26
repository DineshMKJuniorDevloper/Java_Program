package Pattern;

public class Pattern_9043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1;
		
        for(int i=1;i<=5;i++)
        {
        	int start = n;
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(start+ " ");
        		start = start +2;
        	}
        	System.out.println();
        	n = n+2;
        }
	}

}

/*
   1  
   3  5
   5  7  9
   7  9 11 13
   9 11 13 15 17 
   
 */
