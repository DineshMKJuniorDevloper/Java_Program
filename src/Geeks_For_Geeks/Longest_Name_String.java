package Geeks_For_Geeks;

public class Longest_Name_String {

	public static void main(String[] args) {
		
		String [] s = {"Apple", "Mango", "Orange", "Banana" }; 
		int max = s[0].length();
		
		String result="";
		
		for(int i=0;i<s.length;i++)
		{

			if(max<s[i].length())
			{
				max = s[i].length();	
			}
			
		}
		
		for(int j=0;j<s.length;j++)
		{
			if(max==s[j].length())
			{
				result = s[j];
				break;
			}
		}
		System.out.println(result+" result");
		
	}

}
