package week3.day1;

public class CountTheChar {

	public static void main(String[] args) {
		String name="Welcome to testleaf";
		//count how many e present
		//convert string into char Array
		int count=0;
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e') {
				count=count+1;
		}
		
			
		}
		System.out.println(count);

	}

}
