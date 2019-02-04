package javaPrograms;

public class StringReverse {
	public static void main(String[] args) {
		String s1="mohan";
		String s2= " ";

		for (int i =s1.length()-1;i>=0; i--) {
			char c= s1.charAt(i);
			s2=s2+c;
			
		}
		
		
		System.out.println("the string is "+s2);
		System.out.println("hiiiiiiiii");
	}

}
