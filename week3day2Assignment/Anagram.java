package week3day2Assignment;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		boolean status = true;
		
		
		if (text1.length() != text2.length()) {
			status = false;  
			System.out.println("The given strings are not anagram");
		}
		else  {
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray2);
			Arrays.sort(charArray);
		 status = Arrays.equals(charArray, charArray2);
		}
		if (status) {
			System.out.println("The given strings are anagram");
		}else {
			System.out.println("The given strings are not anagram");
		}
					
		}
			
		}
	

