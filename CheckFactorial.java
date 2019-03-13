import java.util.Scanner;
public class CheckFactorial{
	public static void main(String []a){
		System.out.print("Enter a number to find factorial: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("The Factorial of " +number+ " is: " +factorial(number));
	}
	public static int factorial(int n){
		int num = n;
		if (num == 0){
			return 1;
		} 
		return (factorial(num-1)*num);
	}
}