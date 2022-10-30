package week1.day2;

public class LearnOperator {
 
	int a;//Global variable
	
 public static void main(String[] args) {
	 int a=5;//local variable
		System.out.println(5+5);
		System.out.println(5-5);
		System.out.println(5/5);//quotient
		System.out.println(12%5);//Remainder
		System.out.println(5*5);
		//comparison operator
		System.out.println(10==10);
		System.out.println(10<=10);
		//Increment/decrememt
		System.out.println(a++);//addingwith1 a=a+2;5+1
		System.out.println(a);//6
		System.out.println(a--);//6
		System.out.println(a);//5
		//Logical operator
		System.out.println((5==5) && (5<5));
		
		System.out.println((5==5) || (5<5));
		System.out.println(!(5==5));
		
	}

}
