package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String input1="Stop";
		String input2="post";
		//compare the length 
		//sort and compare
		//compare the arrays
		//convert string to char array
		char[] ch1= input1.toCharArray();
		char[] ch2 = input2.toCharArray();
		
		int length1 = input1.length();
		int length2 = input2.length();
		if(length1==length2) {
			System.out.println("same");
		}
		Arrays.sort(ch1);//
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
	}

}
