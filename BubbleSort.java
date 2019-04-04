import java.util.Scanner;
import java.util.Arrays;
/**
*
This is BubbleSort programe.
Time complexcity
worst case:---> O(n^2)
Best case:---> O(n)
Avg case:---->O(n^2)
*
**/
class BubbleSort{
	public static void main(String []args){
		System.out.println("Enter a number to elements size: ");
		Scanner scn = new Scanner(System.in);
		int size = new Scanner(System.in).nextInt();
		int []arr = new int[size];
		for(int i=0; i < arr.length; i++){
			System.out.printf("Enter  %d Element: ", i+1);
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter Unsorted Elements: "+ Arrays.toString(arr));
		/*for(int i=0; i<arr.length; i++){
			System.out.printf(" "+arr[i]);
		}*/
		BubbleSortArray(arr);
		System.out.println("Sorted Elements: "+ Arrays.toString(arr));
	}
	public static void BubbleSortArray(int []arr){
		for(int i=0; i< arr.length; i++){
			for(int j= arr.length-1; j>i; j--){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		//System.out.println("Sorted Elements: "+ Arrays.toString(arr));
	}
}
