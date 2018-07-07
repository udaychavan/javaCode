import java.util.*;


//Powerset from a string
//https://www.geeksforgeeks.org/recursive-program-to-generate-power-set/

public class Powerset {

	private static List<String> powerset(String test){

		List<String> output = new ArrayList<String>();
		String input = test;	
		if(input.length() == 1){
			output.add(input);
			return output; 
		}

		char x = input.charAt(0);
		String newInput = input.substring(1);
		List<String> h = powerset(newInput);
		output.addAll(h);
		output.add(String.valueOf(x));

		for(String abc : h){
			output.add(String.valueOf(x) + abc);	
		}
		return output;
	}

	public static void main(String args[]){
		List<String> array = powerset("abcde");

		System.out.println("Hello World: "+ array.size());
	}
}
