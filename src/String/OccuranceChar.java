package String;

public class OccuranceChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aravindhan";
		char []chs=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = chs[i];
			int count=1; 
			if(ch=='-') {
				continue;
			}
			for(int j=i+1;j<s.length();j++)
			{
				if(ch==chs[j])
				{
					chs[j]='-';
					count++;
					
		
					
				}
			}
			
			System.out.println(ch+" "+count);
		}
		
	} 

}
