package javafinalexam;

public class Question9 {
	
	double money;
	String firstName;
	String lastName;
	
	public Question9 (double money) {
		System.out.println("Money : " + money);
	}

	public Question9 (String firstName, String lastName ) {
		System.out.println( "Name : " + firstName + " " +  lastName );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Question9 tion = new Question9 (5670);
		Question9 tion1 = new Question9 ("Ellaha" , "Sadat");
		
		



	}

}
