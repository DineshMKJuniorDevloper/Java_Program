package Geeks_For_Geeks;

public class Find_IndexPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0,temp2 =0;
	int	ar[] = { 1, 2, 3, 4, 5, 5 };
	int key = 0;
	
			for(int i=0;i<ar.length;i++)
			{
				if(key==ar[i])
				{
					temp = i;
					break;
				}
			}
			System.out.println(temp);
			for(int j=ar.length-1;j>0;j--)
			{
				
				if(key==ar[j])
				{
					temp2 = j;
					break;
				}

			}
			System.out.println(temp+" "+temp2);
			
			
	}

}
