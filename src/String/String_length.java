package String;

public class String_length {

	public static void main(String[] args) {
		String s="    i    am     payilagam student    ";
		
		char[] c = s.toCharArray();
		
		int count=0;
		
		for(char length: c)
		{
			count++;
		}
		
		System.out.println(count);
		int start=0;
		int end=count-1;
		boolean first=false,last=false;
		
		
		for(int i=0;i<end;i++)
		{
			if(s.charAt(start)==' ' && first==false)
			{
				start++;
			}
			else
			{
				first=true;
			}
			
			if(s.charAt(end)==' ' && last==false)
				
			{
				end--;
			}
			else
			{
				last=true;
			}
			
		}
		

		
		boolean space=true;
		for(int z=start;z<=end;z++)
		{
			if(s.charAt(z)!=' ')
			{
				System.out.print(s.charAt(z));
				space=false;
			}
			else if(space==false)
			{
				System.out.print(s.charAt(z));
				space=true;
			}
		}
		
	}
		

}
