package Pattern;

public class Pattern_9031 {

	public static void main(String[] args) {
		
		char ch ='A';
		for(int i=0;i<5;i++)
		{
		    char ch1 = ch;
			for(int j=0;j<5;j++)
			{
				System.out.print(ch1+" ");
				ch1++;
			}
			
			System.out.println();
			ch++;
		}
	}
}
/*
   A B C D E 
   B C D E F
   C D E F G
   D E F G H
   E F G H I

*/