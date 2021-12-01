package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		String str ="madam";
		String rev ="";
		
		for(int i=0;i< str.length();i++) {
			char ch =str.charAt(i);
			rev = ch+rev;
		}
		System.out.println("original string :" + str);
		System.out.println("reverse string :" + rev );
		
	if (rev.equals(str)) {
		
	System.out.println("It is Palindrome");
	}else {
		System.out.println("It is Not a Palindrome");
	}
		

	}

}
