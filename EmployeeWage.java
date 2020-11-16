package employewage;

import java.util.ArrayList;

public class EmployeeWage extends CompanyEmpWage implements CompanyWage {
	
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
	
	public void fullDaily() {
		
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
	public void totalWorking() {
	
		int working_hrs=0;
		int wage=0;
		while(  working_hrs<=100) {
			
			int wage_perhour=20;
			 wage=wage_perhour*working_hrs;
			working_hrs++;
			
		}
		System.out.println("The wage until the condition is reached is" +wage);
	}
	public void getWageCompany1(int working_hrs,int wage_per_hr,int workingDays) {
		
		
		int dailyWage=working_hrs*wage_per_hr;
		System.out.println("Employee wage in company1 is "+dailyWage);
		int monthlyWage=dailyWage*workingDays;
		System.out.println("Monthly Wage in company1 is "+monthlyWage);
		
	}
	
	public void getWageCompany2(int working_hrs,int wage_per_hr,int workingDays) {
		
		
		int dailyWage=working_hrs*wage_per_hr;
		System.out.println("Employee wage in company1 is "+dailyWage);
		int monthlyWage=dailyWage*workingDays;
		System.out.println("Monthly Wage in company1 is "+monthlyWage);
		
	}
	
	public void getWageCompany1() {
		
		int working_hrs=8;
		int wage_per_hr=20;
		int workingDays=20;
		int dailyWage=working_hrs*wage_per_hr;
		System.out.println("Employee wage in company1 using instance is "+dailyWage);
		int monthlyWage=dailyWage*workingDays;
		System.out.println("Monthly Wage in company1 using instance is "+monthlyWage);
		
	}
	
	public void getWageCompany2() {
		
		int working_hrs=8;
		int wage_per_hr=20;
		int workingDays=20;
		int dailyWage=working_hrs*wage_per_hr;
		System.out.println("Employee wage in company2 using instance is "+dailyWage);
		int monthlyWage=dailyWage*workingDays;
		System.out.println("Monthly Wage in company2 using instance is "+monthlyWage);
		
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
		e.totalWorking();
		DailyWage w=new DailyWage();
		w.fullDaily();
		e.getWageCompany1(8,20,20);
		e.getWageCompany2(6,15,20);
		e.getWageCompany1();
		e.getWageCompany2();
		
		int[]companyWage= {company1Wage,company2Wage};
		for (int i1: companyWage) {
			System.out.println(i1);
			
		}
		
		e.getCompany1();
		e.getCompany2();
		ArrayList<Integer> companyWageArrayList=new ArrayList<Integer>();
		companyWageArrayList.add(company1Wage);
		companyWageArrayList.add(company2Wage);
		System.out.println(companyWageArrayList);
	}

	@Override
	public void getCompany1() {
		int working_hrs=8;
		int wage_per_hr=20;
		int workingDays=20;
		int dailyWage=working_hrs*wage_per_hr;
		System.out.println("Employee wage in company1 using instance is "+dailyWage);
		int monthlyWage=dailyWage*workingDays;
		System.out.println("Monthly Wage in company1 using instance is "+monthlyWage);
		
	}

	@Override
	public void getCompany2() {
		int working_hrs=8;
		int wage_per_hr=20;
		int workingDays=20;
		int dailyWage=working_hrs*wage_per_hr;
		System.out.println("Employee wage in company2 using instance is "+dailyWage);
		int monthlyWage=dailyWage*workingDays;
		System.out.println("Monthly Wage in company2 using instance is "+monthlyWage);
		
	}
	
}
class DailyWage{
	
	int daily_wage;
	
public void fullDaily() {
		
		int wage_perhour=20;
		int full_time_hr=8;
		this.daily_wage=wage_perhour*full_time_hr;
		System.out.println("the full time daily wage is  " +daily_wage);
	}
	
}
class CompanyEmpWage{
	
	static int company1Wage=3200;
	static int company2Wage=3000;
}
interface CompanyWage{
	
	public void getCompany1();
	public void getCompany2();
}