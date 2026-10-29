class Employee
{
	String name;
	double basicSalary;
	
	Employee(String name,double basicSalary)
	{
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
}
class Manager extends Employee
{
	double bonous;
	Manager(String name,double basicScalary,double bonous)
	{
		super(name,basicSalary);
		this.bonous=bonous;
	}
	double calculateTotalSalary()
	{
		return basicSalary+bonus;
	}
	void display()
	{
	    System.out.println("Employee Name: " + name);
        System.out.println("Total Salary: " + calculateTotalSalary());
	}
	
}
public class EmployeeSalary
{
	public static void main(String x[])
	{
		Manager m=new Manager("Rahul",30000,5000);
		m.display();
	}
}
