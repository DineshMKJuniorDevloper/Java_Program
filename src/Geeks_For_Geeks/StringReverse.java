package Geeks_For_Geeks;


public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Geeks" , s2 = "forGeeks";
		StringBuilder sb = new StringBuilder();
		
		
	
	sb.append(s1);
    sb.append(s2);
	sb.reverse();
	
	System.out.println(sb.toString());
		
	}

}
