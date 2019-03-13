import java.util.Scanner;
import java.util.Arrays;
class ReverseWordNotChar{
	public static void main(String []args){
		Scanner scn = new Scanner(System.in);
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Enter a number to take No. of words:  ");
		int size = scn.nextInt();
		System.out.println("Enter Words: ");
		String []arr = new String[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = scn1.nextLine();
		}
		System.out.println("Original Words: "+Arrays.toString(arr));
		Reverse(arr);
		//System.out.println("Reversed Words: "+Arrays.toString(arr));
	}
	public static void Reverse(String []a){
		if(a==null || a.length<2){
			return;
		}
		for(int i=0; i<a.length/2; i++){
			String temp= a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		System.out.println("Reversed Words: "+Arrays.toString(a));
	}
}