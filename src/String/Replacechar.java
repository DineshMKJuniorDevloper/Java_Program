package String;

public class Replacechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aravindhan";
		char searc='a';
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(searc==ch) {
				ch='!';
			}
			System.out.print(ch);
		}

	}

}
