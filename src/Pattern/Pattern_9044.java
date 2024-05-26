package Pattern;

public class Pattern_9044 {

	public static void main(String[] args) {
		
		int n=1;
		
		for(int i=1;i<=4;i++)
		{
			int start =n;
			for(int j=1;j<=i;j++)
			{
				System.out.print(start+" ");
				start--;
			}
			System.out.println();
			n = n +i+1;
		}

	}

}
/*
   1
   3 2
   6 5 4
  10 9 8 7
*/