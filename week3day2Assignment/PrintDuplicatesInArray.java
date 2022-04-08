package week3day2Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list= new ArrayList <Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		Collections.sort(list);
		Set<Integer> set= new LinkedHashSet <Integer>();
		for (int duplicate: list) {
			if(set.add(duplicate)== false)
			
		
			System.out.println("the duplicate number in the array is "+ duplicate);
		}
	}
	
}	



