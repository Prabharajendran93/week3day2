package week3day2Assignment;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test ="$$ Welcome to 2nd Class of Automation $$";
		int letter=0, space=0, num=0, specialChar=0;
		
		//convert the string to character array
		
		char[] ch = test.toCharArray();
		
		//traverse through each character using loop
		
		for(int i=0;i<ch.length;i++) {
			
		// find the given character is what type 
			
			if(Character.isLetter(ch[i])) {
				letter++;
				}
				else if(Character.isSpaceChar(ch[i])){
				space++;
				}
				else if(Character.isDigit(ch[i])) {
				num++;
				}
				else {
				specialChar++;
				}
			}
		
		//print the count
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharacterr: " + specialChar);
			}	
	}


