
public class DispalyAZWhileLoop {

	public static void main(String[] args) {
		// Display the Alphabets letter A-Z
		// to go to the next line /n within the print line write it after the first cutation 
		
		char c = 'A'; 
		while (c <='z') {
			// if we do not write = it does not print z 
			System.out.println(c);
			System.out.println(c+" ");  // this will print with space 
			// increment
			c++; 
			System.out.print("/n");
			char ch = 'a';
			System.out.print(ch + " ");
		}

	}

}
