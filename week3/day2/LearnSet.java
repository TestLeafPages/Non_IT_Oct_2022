package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//Create Set
				//Set<Object>lst=new HashSet<Object>();
		   Set<String>set=new LinkedHashSet<String>();
				//add data in set
				set.add("TestLeaf");
				set.add("HP");
				set.add("TestLeaf");
				set.add("Hp");
				set.add("Dell");
				set.add("CTS");
				set.add("TCS");
				
				//print my set
				System.out.println(set);
				//size my list(length)
				System.out.println(set.size());
				//remove data from list
				set.remove("Hp");
				//contains check data present in list
				System.out.println(set.contains("dell"));
				//clear my list
				//set.clear();
				System.out.println(set);
				//My list is empty
				System.out.println(set.isEmpty());
				for (String output : set) {
					
					System.out.println(output);
					
				}
				
				


	}

}
