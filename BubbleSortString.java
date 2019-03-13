import java.util.Scanner;
import java.util.Arrays;
class BubbleSortString{
	public static void main(String []args){
		Scanner scn =new Scanner(System.in);
		Scanner scn1 =new Scanner(System.in);
		System.out.println("Enter a number to take how many word taken: ");
		int size = scn.nextInt();
		String []arr = new String[size];
		for(int i=0; i<arr.length; i++){
			System.out.printf("Enter %d String: ",i+1);
			arr[i] = scn1.nextLine();
		}
		System.out.println("Entered arrays Strings are: "+Arrays.toString(arr));
		SortString(arr);
	}
	public static void SortString(String []arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1; j++){
				if(arr[j].compareTo(arr[j+1]) >0){
					String temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted strings are: "+Arrays.toString(arr));
	}
}