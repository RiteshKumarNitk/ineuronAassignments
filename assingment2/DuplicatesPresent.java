package assingment2;

public class DuplicatesPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 5, 7, 1, 5, 4, 6 };
//        int [] arr = new int [] {0, 2, 3, 4, 2, 7, 8, 8, 8};   
//	          
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
