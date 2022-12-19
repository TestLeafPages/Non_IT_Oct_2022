package week8.day2;

public class NestedTryCatch {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		int[] nums= {10,20,30,40};
		try {
			System.out.println(nums[4]);
	
		       try {
		
			System.out.println(x/y);//block of code		
		            } 
		       catch (ArithmeticException e1) {
					System.out.println(e1);
				}
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
