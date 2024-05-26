package Geeks_For_Geeks;

public class Reversing_the_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
	   String s = "geeksforgeeks";
	   char c;
	   for(int i=0;i<s.length();i++)
	   {
		   c = s.charAt(i);
		   
		   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		   {
			   sb.append(c);
		   }
	   }
	   
	   sb.reverse();
	   
	   System.out.println(sb);
	   //to be contiue...
	  

	}

}
