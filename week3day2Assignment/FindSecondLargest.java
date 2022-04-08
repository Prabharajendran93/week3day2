package week3day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialize the data {3,2,11,4,6,7}
		
		int[] data= {3,2,11,4,6,7};
		
		List<Integer> list=new ArrayList <Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		
		// sort the data
		Collections.sort(list);
		
		// print the second largest
		
		System.out.println("the second largest number is" + list.get(list.size()-2));
	}
		
}
