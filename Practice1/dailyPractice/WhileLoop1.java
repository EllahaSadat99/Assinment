package dailyPractice;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 0;
		while (b <=7) {
			System.out.println(b);
			b++;
				
		}
		int  BB [] = {34,56,78,89,34,56,78,89,34,56,78,89};
		int a = 0; 
		while (a<3 ) {
		System.out.println(BB[a]);
		a++;
	
			
		}
		System.out.println("==================");
		for (int i = 1; i<= 10 ; i++) {
			if (i==5) {
				continue;
				
			}
			System.out.println(i);
			
		}
		
		for (int f = 0; f<=11; f++) {
			if (f== 7) {
				break;
				
			}
			System.out.println("numbers : "+ f);
		}
		System.out.println("******************");
		int [] num = {45,67,89,90,80,600};
		int w = 0;
		do {
			System.out.println("num : " + num[w]);
			w++;
		}while (w < 4);
		
		

	}

}
