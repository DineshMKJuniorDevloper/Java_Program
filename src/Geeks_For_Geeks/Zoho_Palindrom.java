package Geeks_For_Geeks;

public class Zoho_Palindrom {

	public static void main(String[] args) {
		long n = 73;
		long s = n;
		long reverse=0;
		
		while(n!=0)
		{
			long remainder = n % 10;  
			reverse = reverse * 10 + remainder;  
			n = n/10;  
		}
	
		long total = reverse + s;
		long nxttotal = total;
		
		long afr=0;
		while(total!=0)
		{
			long re = total %10;
			afr = afr* 10 + re;
			total = total/10;
		}
		
		
		if(nxttotal == afr)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not palindrom");
		}
	}

}
