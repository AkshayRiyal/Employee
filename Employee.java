package superClassExtract;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;
class Employee extends Person{
	private Date hireDay;
	private double salary;
	public Employee(String n, double s, int year, int month, int day,String address,int age) {
	    name = n;
	    salary = s;
	    GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
	    //  0 J
	    hireDay = calendar.getTime();
	    this.address=address;
	    this.age=age;
	}

	  public Date getHireDay() {
		  
	    return hireDay;
	  
	  }
	   public void raiseSalary(double byPercent) {
	    double raise = salary * byPercent / 100;
	    salary += raise;
	  }
	public  void print()
	   {
		  System.out.println("Name:"+name+"\nSalary:"+salary+"\nDOJ:"+hireDay+"\nAddress:"+address+"\nAge:"+age); 
	   }

			
}