import java.util.Scanner;
class CharCount{
	public static void count(String s){
		char arr[] = s.toCharArray();
		int digit, letter, space, otherCh;
		digit = letter= space = otherCh = 0;
		for(int i=0; i<arr.length; i++){
			if(Character.isLetter(arr[i])){
				letter+=1;
			}
			else if(Character.isDigit(arr[i])){
				digit+=1;
			}
			else if(Character.isSpaceChar(arr[i])){
				space+=1;
			}
			else{
				otherCh+=1;
			}
		}
		System.out.println("Letter: "+letter);
		System.out.println("Digits: "+digit);
		System.out.println("Space: "+space);
		System.out.println("Others Characters are: "+otherCh);
	}
}

class VowelConsoDigitCount{
	public static void VCDcount(String sr){
		int vwl, cons,num,other;
		vwl= cons=num=other=0;
		char arr1[] = sr.toCharArray();
		for(int i=0; i<arr1.length; i++){
			char ch = arr1[i];
			if ( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
				ch == 'A' || ch=='E' || ch == 'I' || ch=='O' || ch=='U' ){
					vwl+=1;
				}
			else if ( ch >= 'a' && ch <= 'z' || ch >='A' && ch<= 'Z' ){
				cons+=1;
			}
			else if ( ch >= '0' && ch<= '9' ){
				num+=1;
			}
			else{
				other+=1;
			}
			
		}
		System.out.println("Vowels: "+vwl);
		System.out.println("Consonants: "+cons);
		System.out.println("Numbers: "+num);
		System.out.println("Others char: "+other);
	}
}
class VowelsConsDigit{
	public static void main(String [] args){
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter  string: ");
		String srt = scn.nextLine();
		//String srt1 = scn.nextLine();
		System.out.println("Entered string are: "+srt);
		CharCount charcount = new CharCount();
		charcount.count(srt);
		VowelConsoDigitCount vcdc= new VowelConsoDigitCount();
		vcdc.VCDcount(srt);
		
	}
	
}