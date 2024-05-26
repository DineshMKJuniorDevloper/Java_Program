package Self;

public class String_First_Cap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "this is awasome this to do";
		String[] ar =s.split(" ");
		
			StringBuilder sb =  new StringBuilder();
			
			for(int i=0;i<ar.length;i++)
			{
				sb= sb.append(Character.toUpperCase(ar[i].charAt(0))+ar[i].substring(1,ar[i].length()-1)+Character.toUpperCase(ar[i].charAt(ar[i].length()-1))+" ");
		
			}System.out.println(sb);

	}

}
