import java.util.Scanner;
public class CheckPalindrome{
	public static void main(String ar[]){
		System.out.print("Enter a number to check palindrome: ");
		int number = new Scanner(System.in).nextInt();
		if(isPalindrome(number)){
			System.out.println("The Entered number "+number+ " is Palindrome");
		}
		else{
			System.out.println("The Entered number " +number+ " Not Palindrome");
		}
	}
	public static boolean isPalindrome(int n){
		int reverse=0;
		int num=n;
		while(num!=0){
			int remainder = num%10;
			reverse = reverse*10+remainder;
			num = num/10;
		}
		if (reverse == n){
			return true;
		}
		else{
			return false;
		}
	}
}