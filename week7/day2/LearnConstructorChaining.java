package week7.day2;

public class LearnConstructorChaining {

	public LearnConstructorChaining() {
		this(1011);
		System.out.println("default Constructor");
		
	}
    public LearnConstructorChaining(int id) {
    	this(34.56f);
	System.out.println("first Constructor");
   }

    public LearnConstructorChaining(String name) {
    	
    	System.out.println("Second Constructor");
	
    }

       LearnConstructorChaining(float pay) {
    	   this("princila");
		System.out.println("Third Constructor");
	}

	
	public static void main(String[] args) {
		LearnConstructorChaining obj=new LearnConstructorChaining();

	}

}
