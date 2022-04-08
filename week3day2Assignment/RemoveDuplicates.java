package week3day2Assignment;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "We learn java basics as a part of java sessions in java week1 ";
		
		//split the string in to array
		String[] split = text.split("");
		String output="";
		Set<String>set = new LinkedHashSet <String>();
		
		for (String eachString : split) {
			set.add(eachString);
		}
		List<String>listString= new ArrayList <String>();
		listString.addAll(set);
		for (int i = 0; i < listString.size(); i++) {
			output=output + listString.get(i);
			if (i<listString.size()-1) {
				output=output+ "";
				
			}
			
		}System.out.println(output);
		

	}

}
 