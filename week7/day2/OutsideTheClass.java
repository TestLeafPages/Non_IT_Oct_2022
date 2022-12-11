package week7.day2;

public class OutsideTheClass extends  LearnFinal {
   
	private  void access(int num) {
		System.out.println("final");
	}
	public static void main(String[] args) {
		LearnStatic.set();
		System.out.println(LearnStatic.num);

	}

}
