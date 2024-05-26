package LeetCode;

import java.util.Stack;

public class ValidParentheses {

	static boolean parentheses(String s)
	{

	Stack<Character> st = new Stack<>();

	for(int i=0;i<s.length();i++)
	{
		
		char c = s.charAt(i);
		
		if(c=='('||c=='['|| c=='{')
		{
			st.push(c);
		}
		else if(c==')' && (!st.empty()) && (st.peek()=='('))
		{
			st.pop();
		}
		else if(c==']' && !st.empty() && st.peek()=='[')
		{
			st.pop();
		}
		else if(c=='{' && !st.empty() && st.peek()=='}')
		{
			st.pop();
		}
		
		else
		{
			return false;
		}
			
	} 
	return st.isEmpty();
	
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			String s = "(){}[";
		
			System.out.println(parentheses(s));
			
	}

}
