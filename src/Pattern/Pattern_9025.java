package Pattern;

public class Pattern_9025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{ 
			int n = 1;
			for(int j=0;j<5;j++)
			{
				System.out.print(((n+j)%2)+" ");
			}
			System.out.println();
		}
	}

}
/*
   1 0 1 0 1
   1 0 1 0 1
   1 0 1 0 1
   1 0 1 0 1
   1 0 1 0 1
*/