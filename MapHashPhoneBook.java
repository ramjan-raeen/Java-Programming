//import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
class PhoneBook{
	public static void main(String []a){
		Map<String, String> phonebook = new HashMap<String, String>();
		phonebook.put("Mohan", "910000" );
		phonebook.put("Ramjan", "910001" );
		phonebook.put("Sohan", "910002" );
		phonebook.put("Rohan", "910003" );
		phonebook.put("Madan", "910004" );
		System.out.println("Mohan:  --> " +phonebook.get("Mohan"));
		System.out.println("Ramjan: --> " +phonebook.get("Ramjan"));
		System.out.println("Sohan:  --> " +phonebook.get("Sohan"));
		System.out.println("Rohan:  --> " +phonebook.get("Rohan"));
		System.out.println("Madan:  --> " +phonebook.get("Madan"));
		System.out.println("Alternative way to print all key pair value: ");
		Set<String> keys = phonebook.keySet();
		for(String i: keys){
			System.out.println(i +" :--> "+phonebook.get(i));
		}
		System.out.println("Alternative 2nd way to print all key pair value: ");
		Set<Map.Entry<String,String>> values = phonebook.entrySet();
		for(Map.Entry<String,String> i : values){
			System.out.println(i.getKey() +" :--> " + i.getValue());
		}
	}
}