package week7.day2;

public class ChildClass extends LearnSuper{
	
	public ChildClass() {
		super();
		 System.out.println("child class");
	 }
	
	public void print() {
		 super.detail();
		 System.out.println(super.id);
		 System.out.println(super.name);
		 System.out.println(super.cmpname);
	 }
	 public static void main(String[] args) {
		 ChildClass obj=new ChildClass();
		 obj.print();
	}
}
