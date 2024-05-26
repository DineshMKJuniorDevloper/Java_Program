package Geeks_For_Geeks;

public class Series_AP {
	
	  public static int nthTermOfAP(int a1, int a2, int n) {
	        // code here
	       int difference = (a2-a1);
	       System.out.print((a1 + (n-1)*difference)+" nth element");
	        return (a1 + (n-1)*difference);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    nthTermOfAP(2,3,4);
		
	}

}
