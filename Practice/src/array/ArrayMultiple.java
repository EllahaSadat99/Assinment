package array;

public class ArrayMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String names [] [] = new String [3] [4] ; 
		
		names [0] [0] = "Anas";
		names [0] [1] = "Ellaha";
		names  [0] [2] = "Jasmine";
		names  [0] [3] = "Bob";
		names  [1] [0] = "Zabi";
		names  [1] [1] = "Alema";
		names  [1] [2] = "Sami";
		names  [1] [3] = "Rahil";
		names  [2] [0] = "Orhan";
		names  [2] [1] = "Mahmood";
		names  [2] [2] = "Ahmad";
		names  [2] [3] = "Wais";
		
		System.out.println(names [2] [0]);
		
		for (int a = 0; a < names.length; a++)
		   for (int b = 0 ; b < names[a] .length; b++) {
			   System.out.println(names[a][b]);
			   
			   
		   }
		   
	        	System.out.println(names.length);
	        	
	        	String namess [] [] = {{"Samim","Marza","Rahim"} ,
                        {"Smira","Alema","Mahmood",} ,
                        {"Aqela","Wjia","Nasima"}
                        };
	        	
	        	for (int i = 0; i < namess.length;i++) {
	        		
	        		for (int a = 0; a <namess[i].length;a++)  {
	        			System.out.println(namess [i] [a] + "     ");
	        			
	        		}
	        	
	    
	    	
	    	
	        	


	}
	        	
	        	                              
	        	
	}
}


				
	        	
		
		

	


