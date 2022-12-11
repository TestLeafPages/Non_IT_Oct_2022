package week7.day2;

public class LearnConstructor {
     
	int id;
	String name;
	public void printData() {
	
		
	}
	public void setData() {
	
		this.printData();
		
		
	}

	public LearnConstructor() {
		
		System.out.println("Body of the default constructor");
		
	}
	public LearnConstructor(int id,String name) {
		this.id=id;
		
		this.name=name;
	
	}
	public static void main(String[] args) {
		System.out.println("before creating object");
		
		LearnConstructor obj=new LearnConstructor(1011,"princila");
		System.out.println(obj.id);
		System.out.println(obj.name);
		
	}

}
