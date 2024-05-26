package Geeks_For_Geeks;

public class SwapNumber {
	 public static void swapKthElements(int[] arr, int k) {
	        int n = arr.length;

	        if (k < 1 || k > n) {
	            System.out.println("Invalid value of k");
	            return;
	        }

	        // Indices for the swap
	        int index1 = k - 1;       // kth element from the beginning
	        int index2 = n - k;       // kth element from the end

	        // Swap the elements
	        int temp = arr[index1];
	        arr[index1] = arr[index2];
	        arr[index2] = temp;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	   /*
	        n = 8
			k = 3
			arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
			Output: {1, 2, 6, 4, 5, 3, 7, 8}
			Explanation:
			3rd element from beginning is 3 and from end is 6.
	    */
	   int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
       int k = 3;

       System.out.println("Original array:");
       for (int num : arr) {
           System.out.print(num + " ");
       }
       System.out.println();

       // Swap the kth element from the beginning with the kth element from the end
       swapKthElements(arr, k);

       System.out.println("Array after swapping:");
       for (int num : arr) {
           System.out.print(num + " ");
       }
       System.out.println();
	   
	}

}
