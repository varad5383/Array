class Vehicle
{
	String name;
	int speed;
	
	Vehicle(String name,int speed)
	
	{
		this.name=name;
		this.speed=speed;
	}
	void display()
	{
		System.out.println("speed of vehicle-"+speed);
		System.out.println("name of vehicle-"+name);
	}
}
class Car extends Vehicle
{
	String model;
	Car(String name,int speed,String model)
	{
		super(name,speed);
		this.model=model;
	}
	void displaydetails()
	{
		super.display();
		System.out.println("model of vehicle-"+model);
	}
}
public class VehicaleDetails
{
	public static void main(String x[])
	{
		Car c=new Car("innove",100,"top");
		c.displaydetails();
	}
}

		