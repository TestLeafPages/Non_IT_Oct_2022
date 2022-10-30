package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		int[] nums= {70,20,50,90,50};
		int[] scores=new int[10];
		
				int[] a = new int[5];
				
				 a[0]=10;
				 a[1]=20;
				 a[2]=30;
				 a[3]=40;
				 a[4]=50;
				 
				//index start from 0
				//Array worked based on index
				System.out.println(nums[0]);
				//to get the array length
				//Array name.length
				//To arrange the array in order
				Arrays.sort(nums);
				
				int length = nums.length; //will assign the local variable ctrl+2 +l
             System.out.println(length);
             //print first data in array
             System.out.println(nums[0]);
             //print the lastdata
             System.out.println("The last data in array"+nums[length-1]);
             //Arrays we cont print directly
            System.out.println(nums);
             //for loop
             for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
             
             
             
             
             

	}

}
