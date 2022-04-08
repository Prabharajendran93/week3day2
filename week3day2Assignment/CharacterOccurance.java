package week3day2Assignment;
public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "welcome to chennai";
		
		//initialize the variable count
		
		int count=0;
		char c= 'n';
		
		//convert the string in to char array
		
		char[] string = str.toCharArray();
		
		//get the length of the array
		
		int length= string.length;
		
		// traverse from 0ntill the array length
		
		for(int i=0;i<length;i++) {
		
		//check the char array has particular char in it 
			
			if(string[i] == c) {
				
		//if it has increment the count
				count ++;
			}
		}
		
		// print the count out of the loop
	
		System.out.println("the count of the character in the string is"  +  count );
	}

}

