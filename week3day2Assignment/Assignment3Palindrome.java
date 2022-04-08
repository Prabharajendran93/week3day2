package week3day2Assignment;

public class Assignment3Palindrome {
	
	public static void main(String[] args) {
		String value= "madam";
		String rev="";
		// TODO Auto-generated method stub
		for(int i=value.length()-1;i>=0;--i) {
	 System.out.print(value.charAt(i));
			rev = rev + value.charAt(i);
	 
 }
	if(value.equals(rev)) {
		System.out.println("the string is palindrome");
	}
	else
	{
		System.out.println("the string is  not a palindrome ");
	}
	}

}
