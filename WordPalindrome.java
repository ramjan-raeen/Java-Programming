import java.util.Scanner;
class WordPalindrome{
	public static void main(String []args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a word to check palindrome: ");
		String wd = scn.nextLine();
		if(Isplindrome(wd)){
			System.out.println("Entered word:--> "+wd+" is palindrome" );
		}
		else{
			System.out.println("Entered word:--> "+wd+" is not palindrome");
		}
	}
	public static boolean Isplindrome(String a){
		String s="";
		for(int i = a.length()-1; i>=0; i--){
			s+=a.charAt(i);
			
		}
		return a.equalsIgnoreCase(s);
		
		/*if(a.equalsIgnoreCase(s)){
			return true;
		}
		else{
			return false;
		}*/
	}
}