package stringBufferBulder;

public class CharArrayToString {
	

	public static void main(String[] args) {
		
		char [] c = { 'H', 'e' ,  'l',  'l',  'o'};
		String str = new String( c);
		System.out.println(str);
		
		 String str2 = String.valueOf( c);
		 System.out.println(str2);


	}

}
