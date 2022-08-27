package javafinalexam;

public class Question8 {
	
	public static void main(String[] args) {
		
		String name = "Ahmad";
		int index = 2;
		char ch = 'm';
		
		
		
		String name1 = name.toUpperCase();
		System.out.println("Capital letter : " + name1);
		
		String  name2 = name.toLowerCase();
		System.out.println("Small letter : " + name2);
		
		System.out.println("Original name : " + name);
		
		StringBuilder string = new StringBuilder (name1);
		String.setCharAt( index, ch);
		System.out.println("**** : " + string);
		
	}

}