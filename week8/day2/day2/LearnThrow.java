package week8.day2;

public class LearnThrow {

	
	public int div(int num1,int num2) {
		int result;
		if(num1>num2) {
			result=num1/num2;
		}
		else {
			throw new ArithmeticException("Input is not valid");
		}
		return result;
	}
	
	public static void main(String[] args) {
		LearnThrow lt=new LearnThrow();
		
		int div;
		try {
			div = lt.div(5, 16);
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
