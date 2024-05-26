package Geeks_For_Geeks;

public class Remove_Vowels_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to geeksforgeeks";
		String n="";
		
		
			   n	= s.replaceAll("[aeious]","");
			   System.out.println(n);
		//output : wlcm t gkfrgk
	}

}
