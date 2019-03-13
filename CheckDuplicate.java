import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckDuplicate{
	public static void main(String []a){
		System.out.println("Enter a word: ");
		String str = new Scanner(System.in).nextLine();
		findDuplicateChar(str);
	}
	// find all duplicate number in string and count them;
	public static void findDuplicateChar(String s){
		char []characters = s.toCharArray();
		// build HashMap with character and number of times they appear in String
		
		Map <Character, Integer> charMap = new HashMap <Character, Integer>();
		for(Character ch: characters){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}
			else{
				charMap.put(ch,1);
			}
		}
		// // Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List numbers of duplicate character in %s %n", s);
		for (Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue() > 1){
				System.out.printf("%s :--> %d \n", entry.getKey(), entry.getValue());
			}
		}
		
	}
}