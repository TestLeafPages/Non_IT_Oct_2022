package week1.day2;

public class Mobile {
/*
 *  Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run …
 */
	public void makeCall() {
		String mobileModel ="samv23";
		float mobileWeight=12.2f;
		System.out.println("Making call");

	}
	private void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=30000;
		System.out.println("Sending Message");

	}
	public static void main(String[] args) {
		Mobile obj= new Mobile();
		obj.sendMsg();
		obj.makeCall();
		System.out.println("This is my mobile");
	}
	
}
