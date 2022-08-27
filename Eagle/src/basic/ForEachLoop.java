package basic;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arrData= {"Alpha", "Beta", "Gama", "Delta"};
	     for (int i =0 ; i <arrData.length; i++) {
	    	 System.out.println(arrData[i]);
	     }
	     System.out.println("\n\nUsing convention for loop : ");
	     for (String strTemp: arrData) {
	    	 System.out.print(strTemp + "   ");
	     }

	}

}
