package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String temp="";
		
		for(int i=0;i< test.length();i++) {
			char ch=test.charAt(i);
			temp =ch+temp;
		}
		System.out.println(temp);
	}

}
