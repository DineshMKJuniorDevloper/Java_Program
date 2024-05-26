package String;

public class StringLength_WhiteSpeceRem_withoutLength {

	public static void main(String[] args) {
		String s="                 dinesh    is welcome  ";
		String a="";
		int count=0;
		while(true) 
		{
			
			try 
			{
				s.charAt(count);
				count++;
			}
			catch(Exception e) 
			{
				break;
			}
		}
		
		
		
		System.out.println(count);
		
		boolean space=true;
		for(int i=0;i<count;i++)
		{
			if(s.charAt(i)!=' ')
			{
				a=a+s.charAt(i);
				space=false;
			}
			else if(space==false)
			{
				a=a+s.charAt(i);
				space=true;
			}
		}
		System.out.println(a);
		
		int length=0;
		while(true)
		{
			try
			{
				a.charAt(length);
				length++;
			}
			catch(Exception m)
			{
				break;
			}
		}
		
		System.out.println(length+" =length");
		
		
		String emp ="";
		
		
		for(int i=0;i<length-1;i++)
		{
			emp = emp + a.charAt(i);
		}
	System.out.println(emp);
	}
}
