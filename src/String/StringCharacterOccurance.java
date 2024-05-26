package String;

public class StringCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="deepak hooda my";
		
		char ch[] = s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			char c = ch[i];
			
					if(c=='-')
					{
						continue;
					}
			for(int j=i+1;j<s.length();j++)
			{
				if(c==ch[j])
				{
					ch[j]='-';
					count++;
				}
			}
			
			
			System.out.println(count+" "+ch[i]);
		}
		
	}

}
