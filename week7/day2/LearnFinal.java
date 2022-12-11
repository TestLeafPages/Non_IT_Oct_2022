package week7.day2;

import java.util.ArrayList;
import java.util.List;

public final class LearnFinal {//class we cannot extend
  
	final int cvv=120;
	//no override
	public final void print(int num) {
		System.out.println("final");
	}
	
  public static void main(String[] args) {
		LearnFinal obj=new LearnFinal();
		System.out.println(obj.cvv=321);
		
		
	}
	

}
