package stringobject;

public class Negativestring {

	public static void main(String[] args) {
		
		String str = "-123";
		int iNum = 1 ;
		
		
		int iNum2 = Integer.valueOf( str);
		int negative = iNum - iNum2;
		System.out.println(negative);

	}

}
