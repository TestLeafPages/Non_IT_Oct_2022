package week2.day1;

public class LearnReturn {
	int num=1;
	public int add(int num1,int num2) {
		System.out.println(num1+num2);
		return num1;
	}
	
	
	public String sendMsg(String text) {
		
		System.out.println(text);
		return text;
	}
	
	
	public static void main(String[] args) {
		//create object 
		LearnReturn obj=new LearnReturn();
		obj.sendMsg("Testleaf");
	}

}
