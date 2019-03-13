import java.util.Scanner;
import java.util.Arrays;
//This is InsertionSort programe.
// Time complexcity
// Worst case:---> O(n^2)
// Avg case: ----> O(n^2)
// best case:----> O(n)
class InsertionSort{
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
		InsertionSortArray(arr);
	}
	public static void InsertionSortArray(int []arr){
		for(int i=1; i<arr.length; i++){
			int current = arr[i];
			int j=i;
			while(j>0 && arr[j-1]>current){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]= current;
		}
		System.out.println("Sorted Elements: "+ Arrays.toString(arr));
	}
}