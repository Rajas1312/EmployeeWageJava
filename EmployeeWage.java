package employewage;

public class EmployeeWage {
	
	int daily_wage;
	
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
	
	public  void fullDaily() {
		
		int wage_perhour=20;
		int full_time_hr=8;
		this.daily_wage=wage_perhour*full_time_hr;
		System.out.println("the full time daily wage is  " +daily_wage);
	}
	
	public static void partTime() {
		
		int wage_perhour=20;
		int part_time_hr=8;
		int daily_wage=wage_perhour*part_time_hr;
		System.out.println("the part time daily wage is  " +daily_wage);
	}
	public void monthWage() {
		
		int working_days=20;
		int month_wage=working_days*daily_wage;
		System.out.println("The monthly wage is " +month_wage);
		
	}

	public static void main(String[] args) {
		EmployeeWage e=new EmployeeWage();
		greet();
		attandance();
		e.fullDaily();
		partTime();
		int i=(int)(Math.random()*10)%3;
	switch(i) {
	
	case 1:
		e.fullDaily();
		break;
		
	case 2:
		partTime();
		break;
		
	default :
		System.out.println("Invalid");
	}
	
		e.monthWage();
	}

}
