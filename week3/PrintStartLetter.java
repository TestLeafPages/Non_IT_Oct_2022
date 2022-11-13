package week3.day1;

public class PrintStartLetter {

	public static void main(String[] args) {
		String str="Testleaf Open Today";
		//split my string
		String[] split = str.split(" ");
		//iterate the split value
		for (int i = 0; i < split.length; i++) {
		if(split[i].startsWith("T")) {
			System.out.println(split[i]);
		}
		
		}
		
		

	}

}
