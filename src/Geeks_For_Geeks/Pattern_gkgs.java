package Geeks_For_Geeks;

public class Pattern_gkgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n =2;
		
		for(int i=n;i>=1;i--)
		{
			
			for(int j=n;j>=1;j--)
			{
				for(int z=i;z>=1;z--)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}

}

/*
  3 3 3 2 2 2 1 1 1
  3 3 2 2 1 1
  3 2 1
 */



