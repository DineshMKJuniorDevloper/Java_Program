package Pattern;

public class Pattern_9032 {

	public static void main(String[] args) {
		
		int ch = 65;
		
		for(int i=0;i<5;i++)
		{
			int ch1 = ch;
			
			for(int j=0;j<5;j++)
			{
				System.out.print((char)ch1+" ");
				ch1=ch1+5;
			}
			 
			ch++;
			System.out.println();
		}

	}

}
