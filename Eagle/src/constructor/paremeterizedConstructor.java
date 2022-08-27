
package constructor;

public class paremeterizedConstructor {
	String name ; 
	int id ;
	
	
	
	// Arrgument are used here with the help of this keyword
	paremeterizedConstructor (String name, int id) {
		this.name = name ; 
        this.id	= id;
        
	}

	public static void main(String[] args) {
		// create obj 
		paremeterizedConstructor obj = new paremeterizedConstructor ("Elena", 101) ;
		System.out.println( obj.name);
		System.out.println(obj.id);
			
		}
		

	}


