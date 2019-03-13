import java.util.Scanner;
public class CheckArmstrong{
	public static void main(String []a){
		System.out.print("Enter a number to check Armstrong: ");
		int number = new Scanner(System.in).nextInt();
		if(isArmstrong(number)){
			System.out.println("Entered number "+number+ " is Armstrong");
		}
		else{
			System.out.println("Entered number "+number+ " is not Armstrong");
		}
	}
	public static boolean isArmstrong(int n){
		int num= n;
		int armstrong=0;
		while(num!=0){
			int remainder = num%10;
			armstrong+=(remainder*remainder*remainder);
			num = num/10;
		}
		if(armstrong ==n){
			return true;
		}
		else{
			return false;
		}
	}
}