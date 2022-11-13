package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Create list
		//List<Object>lst=new ArrayList<Object>();
		List<Integer>lst=new ArrayList<Integer>();
		//add data in list
		lst.add(10);
		lst.add(10);
		lst.add(10);
		lst.add(20);
		lst.add(50);
		lst.add(40);
		//print my list
		System.out.println(lst);
		//size my list(length)
		System.out.println(lst.size());
		//remove data from list
		lst.remove(2);
		//contains check data present in list
		System.out.println(lst.contains(70));
		//clear my list
		//lst.clear();
		System.out.println(lst);
		//My list is empty
		System.out.println(lst.isEmpty());
		//get(i)means to fetch particular value form list
		System.out.println(lst.get(3));
		//loop
		for (int i = 0; i <lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		//sort the lst arrange the data
		Collections.sort(lst);
		System.out.println(lst);

	}

}
