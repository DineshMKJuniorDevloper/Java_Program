package Geeks_For_Geeks;

public class Count_typeofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="#GeeKs01fOr@gEEks07";
		int digits=0;
		int uppercase=0;
		int lowercase=0;
		int specialchar=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch))
			{
				digits++;
			}
			else if(Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowercase++;
			}
			else if(!Character.isLetterOrDigit(ch)&& !Character.isWhitespace(ch))
			{
				specialchar++;
			}
		}
		
		System.out.println("Digits "+ digits);
		System.out.println("Uppercase "+ uppercase);
		System.out.println("lowercase "+ lowercase);
		System.out.println("specialchar "+ specialchar);
	}

}
