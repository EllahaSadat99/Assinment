package education;

public class SwitchCaseExamples {

	public static void main(String[] args) {
		// 
		int num = 10;
		// (num * 5 + num)=60
		
		
		switch (num * 5 + num) {
		case 20: 
			System.out.println("Option 1: 20");
			break;
		case 40: 
			System.out.println("Option 2: 40");
			break; 
		case 60:
			System.out.println("Option 3: 60");
			break;
			default:
				System.out.println("Non of above option is correct");
				
	}

}
