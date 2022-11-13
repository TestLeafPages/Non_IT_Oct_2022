package week3.day1;


public class LearnString {

	public static void main(String[] args) {
		//literal
		String name="TestLeaf located in chennai Testleaf";
		String name1="";
		//object for String
		String str=new String("Testleaf");
		String str1=new String("Testleaf");
		
		//compare the string reference
		System.out.println(name==name1);
		//compare the string value
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		//get size length of the string
		//String name.length()
		int length = name.length();
		System.out.println("The length of string"+length);
		//split the string by space
		String[] split = name.split("\\D");//ctrl+2+l
       for (int i = 0; i <split.length; i++) {
		System.out.println(split[i]);
	}
		//Startswith
      System.out.println( name.startsWith("T"));
      //EndWith 
      System.out.println(name.endsWith("f"));
      //isEmpty
      System.out.println(name1.isEmpty());
		//subString
      //part of string
      String input="         CRM/SFA       ";
      //start indext
      System.out.println(input.substring(5));
      //end index add 1
      System.out.println(input.substring(0, 6));
      
      //Trim(Remove leading and trailing space)
      System.out.println(input.trim());
      //convert string into char
      char[] charArray = name.toCharArray();//ctrl+2+l
      System.out.println(charArray);
     
      //index
      System.out.println(name.charAt(2));
      System.out.println(name.toUpperCase());
      System.out.println(name.toLowerCase());
      //concat join two string
      System.out.println(name+input);
      System.out.println(name.concat(input));
      System.out.println("output"+name);
		
		
		
		
		
		

	}

}
