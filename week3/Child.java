package week3.day1;

public class Child extends Parent{
	
	public void child() {
		System.out.println("child");
	}
	public static void main(String[] args) {
		Child obj=new Child();
		obj.oneHouse();
		obj.TwoHouse();
		obj.ThirdHouse();
		obj.child();

	}

}
