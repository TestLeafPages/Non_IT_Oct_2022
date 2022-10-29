package week1.day1;
//comment line
public class Car {

	//Access modifier return type methodName
	//shortcut key to create a method ctrl+space
	public void applyBreak() {
		System.out.println("This is from Car class");
	}
	private void driveCar() {
		System.out.println("This is driveCar");

	}
	
	public static void main(String[] args) {
		//object    to call the class by creating object
		Car obj=new Car();
		obj.applyBreak();
		obj.driveCar();
		
		
	}
	
}


