package Geeks_For_Geeks;

public class Palindromic_Array_EC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int a[] = {111, 222 ,333, 444, 555};
		int a[] = {121,20,131};
		int result =0;
		
		for(int i=0;i<a.length;i++)
		{
		  int rev=0;
		  int temp = a[i]; 
			while(temp>0)
			{
				int id = temp%10;
				  temp = temp/10;
				  rev = rev*10 + id;
			}
			
		      	if(a[i]==rev)
					{
						result=1;
					}
					else
					{
						result=0;
						break;
					}
			

		}
		System.out.println(result);
	}

}
