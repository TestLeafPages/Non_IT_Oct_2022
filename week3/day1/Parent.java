package week3.day1;

public class Parent extends GrandParent {
	
	public void ThirdHouse() {
		System.out.println("Parent");
	}

	public static void main(String[] args) {
		
		Parent obj=new Parent();
		obj.oneHouse();
		obj.TwoHouse();
		obj.ThirdHouse();
	}

}
