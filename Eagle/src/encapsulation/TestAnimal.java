package encapsulation;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal myanimal = new Animal ( );
		 myanimal.setName( "lion");
		 myanimal.setWight ( 350);
		 myanimal.setLegs( 4);
		 System.out.println( "Name  : " + myanimal.getName( ) );
		 System.out.println("kg : " +  myanimal.getWight( ));
		 System.out.println( "leg : " +  myanimal.getLegs ( ) );
		 

	}

}
