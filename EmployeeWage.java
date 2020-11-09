package employewage;

public class EmployeeWage {
	
	public static void greet() {
		
		System.out.println("Welcome to Employee wage computation programe");
	}
	
	public static void attandance() {
		
		int attend=(int)(Math.random()*10)%2;
		System.out.println(+attend);
		if(attend==1) {
			System.out.println("The Employee is present");
		}
			else {
				
				System.out.println("The Eployee is Absent");
			}
		
	}
	
	public static void fullDaily() {
		
		int wage_perhour=20;
		int full_time_hr=8;
		int daily_wage=wage_perhour*full_time_hr;
		System.out.println("the full time daily wage is  " +daily_wage);
	}
	
	public static void partTime() {
		
		int wage_perhour=20;
		int part_time_hr=8;
		int daily_wage=wage_perhour*part_time_hr;
		System.out.println("the part time daily wage is  " +daily_wage);
	}

	public static void main(String[] args) {
		greet();
		attandance();
		fullDaily();
		partTime();
	
	}

}
