package week1.day3;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		char[] ch= new char[str.length()];
		for (int i=0;i < str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i] == ch[j]) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}

}
