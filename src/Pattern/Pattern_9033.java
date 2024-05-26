package Pattern;

public class Pattern_9033 {

	public static void main(String[] args) {
		
		
		for(char i=69;i>=65;i--)
		{
			int ch = i;
			for(int j=0;j<5;j++)
			{
				System.out.print((char)ch+" ");
				ch = ch+5;
			}
			System.out.println();
		}

	}

}
/*
   E J O T Y
   D I N S X
   C H M R W
   B G L Q V 
   A F K P U
*/