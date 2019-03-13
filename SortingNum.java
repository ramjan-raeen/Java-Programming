import java.util.Scanner;
import java.util.Arrays;
//import java.io.*;
class SortingNum{
	public static void main(String []args){
		System.out.println("Enter a number, How many number you want to take");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int []a = new int [num];
		for(int i=0; i<num; i++){
			System.out.printf("Enter %d number: ", i+1);
			a[i] = scn.nextInt();
		}
		/*System.out.println("Unsorted Elements: " + Arrays.toString(a));
		Arrays.sort(a);*/
		System.out.println("Unsorted Element:");
		for(int i =0; i<a.length; i++){
			System.out.printf(" %d",a[i]);
		}
		/*System.out.println("The Sorted arrays: " + Arrays.toString(a));*/
		int temp;
		int num1 = a.length;
		for(int i=0; i<num1; i++){
			for(int j=0; j<num1-i-1; j++){
				if(a[j]>=a[j+1]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nSorted Element:");
		for(int i=0; i< num1; i++){
			System.out.print(" "+a[i]);
		}

	}
}