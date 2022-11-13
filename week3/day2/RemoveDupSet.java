package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupSet {

	public static void main(String[] args) {

      String[] name={"Testleaf","DELL","TESTLEAF","Testleaf"};
      
      Set<String>set=new HashSet<String>(Arrays.asList(name));
      System.out.println(set);
      //convert set into list
      List<String>lst=new ArrayList<String>(set);
      System.out.println(lst);
      

	}

}
