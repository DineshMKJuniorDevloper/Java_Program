package String;

public class Scanerios_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Muthu";
		String s2 = new String("Muthu");
		String s = "jav";
		String b = "a";
		
		System.out.println(s+b);
		
		if(s1==s2)
		{
			System.out.println("Primitive data type value equal");
		}
		else
		{
			System.out.println("Primitive data type Not equal"); //output
		}
		
		if(s1.equals(s2))
		{
			System.out.println("Two objects are equal");//output
		}
		else
		{
			System.out.println("Not equla");
		}
	}

}
