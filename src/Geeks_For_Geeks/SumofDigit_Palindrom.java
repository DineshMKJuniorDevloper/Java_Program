package Geeks_For_Geeks;

public class SumofDigit_Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 98;
		
		int rev = 0;
		int va = n/10;
		
		int mod= n %10;
		
		int sum = va + mod;
		
		while(sum!=0)
		{
			int remainder = sum % 10;  
			          sum = sum/10; 
			rev= rev* 10 + remainder;  
		}
		if(rev==n)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not palindrom");
		}

	}

}
