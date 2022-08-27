package dailyPractice;

public class StaticMethod {
      /*
       static method belong to a class not an instance of a class  
      */
	 static void display () {
		 System.out.println("This is a static method");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display () ;
		  method();
	}
     static void method () {
    	 System.out.println("****************");
     }



      
        
}