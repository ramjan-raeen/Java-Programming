import java.util.Scanner;
public class PrimeNum{
	public static void main(String []args){
		System.out.print("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		int result = checkPrime(number);
		if (result == 1){			
			System.out.println("This No. "+number+" is Not prime Number:");
		}
		else{
			System.out.println("this No. "+number+" is  Prime: ");
		}
	}
	public static int checkPrime(int num){
		for(int i=2; i<num; i++){
			if(num%i==0){
				return 1;
			}
		}
		return 0;
	}
}