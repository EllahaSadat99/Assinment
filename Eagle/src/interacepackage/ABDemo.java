package interacepackage;

    public class ABDemo implements  AInterface, BInterface  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("printing the value of x : " + x);
		System.out.println("price from A Interface : " + AInterface.x);
		System.out.println("price from B Interface : "+ BInterface.x);
	//	System.out.println("Company : "+BInterface.Company );
		int z = 10; 
		z = 12;
		System.out.println("Value of Z at this point : " + z * 2);
		
		

	}

}
