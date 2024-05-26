package Geeks_For_Geeks;

public class UpperCaseconversion {

	public static void main(String[] args) {
		
	String s = "i love programming";

	char[] c = s.toCharArray();
	
	for(int i=0;i<s.length();i++)
	{
		if(i==0 && c[i]!=' ' || c[i-1]==' ' && c[i]!=' ')
		{
			
			 c[i]-=32;
		}
	}
	
	System.out.println(String.valueOf(c));
	}

}
