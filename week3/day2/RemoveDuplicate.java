package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//classRoom 2:
			//Declare and initialize the String Input="TesTLeaf";
		String input="TesTleaf";
			//convert String into charArray
		char[] charArray = input.toCharArray();
			//To Remove the duplicate(Using Set)
		Set<Character>unique=new LinkedHashSet<Character>();
			//use Loop to iterate till the Array Length
		for (int i = 0; i < charArray.length; i++) {
			if(!unique.add(charArray[i])) {
			
				unique.remove(charArray[i]);	
		}
		}
		System.out.println(unique);
			//write the condition(if)to remove the duplicate char
			//add the data into set
			//print the output of set

	}

}
