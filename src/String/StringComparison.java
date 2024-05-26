package String;
import java.util.*;

public class StringComparison {

	public static void main(String[] args) {
      String s1 = new String("Cpple");
      String s2 = new String("Banana");
      String s3 = "phpjava Appel";
      
      StringBuffer sb = new StringBuffer("Java");
     String s = "JAVA";
    
      System.out.println(s1.equals(s2)); //false
      System.out.println(s1.equalsIgnoreCase(s2)); //true
      
      System.out.println(s1.compareTo(s2)); //-32  this method is lexicographically method(அகர வரிசைப்படி)
      
      System.out.println(s1.compareToIgnoreCase(s2));
      
      System.out.println(s1.startsWith("c"));//false because of the Capital C
      
      System.out.println(s1.startsWith("C")); //true  
      
      System.out.println(s1.endsWith("e"));//true
      
      System.out.println(s3.startsWith("java", 3)); // enaku javanu start aaganum but 3 vathu edathula irunthu start aaganum
      
     System.out.println(s.contentEquals(sb)); // true string object values are equals to string Buffers Objects values are equal
     
     // leet code problem
   String str = "Sunday is funday";
   String str1 = "is";
   System.out.println(str.contains(str1));
      
      
      
	}

}
