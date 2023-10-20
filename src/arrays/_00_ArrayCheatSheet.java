package arrays;

import java.lang.reflect.Array;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
//		//1. make an array of 5 Strings
	for( int i = 0; i< 10; i++) {
		int[] intarr = new int[5];
		intarr[2] = i;
		//2. print the third element in the array
		System.out.println(intarr[2]);
		//3. set the third element to a different value
		intarr[2] = i + 5;
		//4. print the third element again
		System.out.println(intarr[2]);
}
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		
		int[] inte = new int[50];
		for( int i = 0; i < 50; i++) {
		//7. use a for loop to make every value of the integer array a random number
			int e = i;
		inte[i]  = e;
		System.out.println( inte[i] );
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(inte[0]);
		System.out.println(inte[49]);
	
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		
	}
}
