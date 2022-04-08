package week3day2Assignment;

public class ReverseEvenNumbers {

	public static void main(String[] args) {	
		// declare the input
		
		String test ="i am a software tester";
		String output="";
		
		// split the words and have it in an array
		
		String[] words=test.split(" ");
		
		//traverse each word using loop
		
		for(int i=0;i<words.length;i++)
		{
		// find the odd index within the loop
			
			if(i%2 !=0 ) {
				
		// split the words and have it in an array
				
				char[] ch = words[i].toCharArray();
				String word1=" ";
				
		//print the even position words in an reverse order
			
		  for(int j=ch.length-1;j>=0;--j)
				
			{
			  	word1 = word1 +ch[j];
			}
		  output= output+word1;
		}
			else
			{
				output=output+words[i];
				
			}
		
			if(i<words.length-1) {
				output=output+"";
			}
		}System.out.println(output);
	}
}

	


