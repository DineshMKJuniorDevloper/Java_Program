package Geeks_For_Geeks;

public class AtLeast_Two_greaterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {2, 8, 7, 1, 5};
		
		
		int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : ar) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
            else
            {
            	
            }
        }

        System.out.println("First Maximum: " + firstMax);
        System.out.println("Second Maximum: " + secondMax);

	}

}
