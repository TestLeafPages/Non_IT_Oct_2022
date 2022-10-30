package week1.day2;

public class Bike {

	public void twoWheeler() {
		System.out.println("Bike class");
	}
	
	
	public static void main(String[] args) {
	Car obj=new Car();
	obj.applyBreak();
	obj.soundHorn();
	Bike bk=new Bike();
	bk.twoWheeler();
	
}
}
