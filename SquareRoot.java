import java.util.Scanner;
class SquareRoot{
	public static void main(String []a){
		Scanner scn = new Scanner(System.in);
		System.out.printf("Enter a number: ");
		double num = scn.nextDouble();
		double result = Math.sqrt(num);
		System.out.printf("Square root of " +num+ " is: " + result);
	}
}