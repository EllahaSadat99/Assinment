package dailyPractice;

public class MyEmployee {
	String name;
	String Position;
	int WorkHour;
	int Salary;
	
	public void  Employee () {
		
		System.out.println("Name :"  + name);
		System.out.println("Position: " + Position);
		System.out.println("WorkHour per day is : " + WorkHour);
		System.out.println("The amount of salary is : " + Salary);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyEmployee Chart = new MyEmployee (); 
		Chart.name = "Ahmad";
		Chart.Position = "Maneger";
		Chart.WorkHour= 9;
		Chart.Salary = 24000;
		
		Chart.Employee();
		System.out.println("information of employee");
		
		
		}
		

	}


