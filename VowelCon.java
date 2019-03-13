import java.util.Scanner;
class VowelCon{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a word");
		String sr = scn.nextLine();
		char []arr = sr.toCharArray();
		// Note:--> it's also covert in to Lower case or Upper case by using below syntax;
		// Lower = sr.toLowerCase();
		// Upper = sr.toUpperCase();
		int vwl, cons, num, other,space;
		vwl=cons=num=other=space=0;
		for (int i=0; i< arr.length; i++){
			if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' 
				|| arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ){
				vwl+=1;
			}
			else if (arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <='Z'){
				cons+=1;
			}
			else if(arr[i] >= '0' && arr[i] <='9'){
				num+=1;
			}
			else if(arr[i] == ' '){
				space+=1;
			}
			else{
				other+=1;
			}
		}
		System.out.println("Vowels: "+vwl);
		System.out.println("Consonats: "+cons);
		System.out.println("Numbers: "+num);
		System.out.println("Others Characters: "+other);
		System.out.println("Spaces: "+space);
	}
}