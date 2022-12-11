package week7.day2;

public class LearnOverLoading {

	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int c) {
		int d=a+b;
		System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		LearnOverLoading obj=new LearnOverLoading();
		obj.add(10, 20);
		obj.add(30, 10, 30);

	}

}
