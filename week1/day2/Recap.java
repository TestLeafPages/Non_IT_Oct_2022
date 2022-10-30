package week1.day2;

public class Recap {
 
 String name="Testleaf";
 int num=1;
 
 public void learn() {
System.out.println("Learning");
}
	public static void main(String[] args) {
		System.out.println("welcome");
		//object
		Recap obj=new Recap();
		obj.learn();
		System.out.println(obj.name);
		
	}	
}
