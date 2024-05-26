package Geeks_For_Geeks;

import java.util.ArrayList;

public class Mutiplication_Table_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		ArrayList<Integer> al= new ArrayList<>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(n*i);
		}
		
		System.out.println(al);
		
	}

}
// output [9, 18, 27, 36, 45, 54, 63, 72, 81, 90]
