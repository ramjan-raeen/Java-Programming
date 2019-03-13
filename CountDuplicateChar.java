import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class CountDuplicateChar{
	public static void main(String []a){
		System.out.printf("Enter a word: ");
		String str = new Scanner(System.in).nextLine();
		CountDuplicate(str);
	}
	public static void CountDuplicate(String s){
		char []arr = s.toCharArray();
		Map<Character, Integer> CharMap = new HashMap<Character, Integer>();
		for(Character ch : arr){
			if(CharMap.containsKey(ch)){
				CharMap.put(ch, CharMap.get(ch)+1);
			}
			else{
				CharMap.put(ch, 1);
			}
		}
		Set<Map.Entry<Character, Integer>> values= CharMap.entrySet();
		System.out.println("Duplicate Character:");
		for(Map.Entry<Character, Integer> i : values){
			if(i.getValue() > 1){
				System.out.println(i.getKey()+" :---> " +i.getValue());
			}
			
		}
		
	}
}