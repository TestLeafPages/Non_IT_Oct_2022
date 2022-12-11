package week7.day2;

public class LearnStatic {
	//static datatype variable =value
	static int num=20;
	int num1=20;
	
	//access modifier static return type method name
	public static void set() {
		System.out.println("LearnStatic");
	}
	public void get() {
		
	}
	public static void main(String[] args) {
		LearnStatic obj=new LearnStatic();
		System.out.println(num);
		System.out.println(obj.num1);
		set();
		obj.get();
		

	}

}
