package week3.day2;

public class Concrete extends BankInfo implements RBI,Axis  {

	@Override//same method same arg different class
	public void interest() {
		System.out.println();
		
	}

	public void draft() {
		// TODO Auto-generated method stub
		
	}

	public void risk() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Concrete obj=new Concrete();
		obj.draft();
		obj.interest();
		obj.risk();
	}

}
