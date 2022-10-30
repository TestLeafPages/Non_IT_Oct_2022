package week1.day2;

public class FindTheCount {

	public static void main(String[] args) {
		int[] num= {11,22,33,55,33,44,33};
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]==33) {
				
				count++;
				break;
			}
			
		}
		System.out.println(count);
		

	}

}
