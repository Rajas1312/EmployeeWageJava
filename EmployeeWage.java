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

	public static void main(String[] args) {
		greet();
		attandance();
	}

}
