package week3day2Assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// declare an array for {3,2,11,4,6,7}
		
		List<Integer> ar1=new ArrayList<Integer>();
		ar1.add(3);
		ar1.add(2);
		ar1.add(11);
		ar1.add(4);
		ar1.add(6);
		ar1.add(7);
		
		// declare an array for {1,2,8,4,9,7}
		
		List<Integer> ar2=new ArrayList<Integer>();
		ar2.add(1);
		ar2.add(2);
		ar2.add(8);
		ar2.add(4);
		ar2.add(9);
		ar2.add(7);
		
		//declare for loop iterator from 0 to array length
		
		for (int i = 0; i < ar1.size(); i++) {
			for (int j = 0; j < ar2.size(); j++) {
				
		//compare both arrays using a condition statement
				
				if (ar1.get(i) == ar2.get(j)) {
					
				}
		//print the first array
				
				System.out.println("the first array is" + ar1.get(i));
				
				
			}
			
			
		}
		
		
		
	}

}
