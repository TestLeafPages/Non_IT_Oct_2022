package week3.day1;

import java.util.Arrays;

public class FindEachCharOccurance {

	public static void main(String[] args) {
		String input="welcome to Testleaf";
		int count=0;
		
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i < charArray.length-2; i++) {
			count=1;
			for (int j =i+1; j < charArray.length-1; j++) {
			if(charArray[i]==charArray[j]) {
				count=count+1;
				
			}
		}
			if(count>1) {
				System.out.println(charArray[i]+"  "+count);
			}
	}

}
}