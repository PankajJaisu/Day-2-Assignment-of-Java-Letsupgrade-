public class Day1Assignment1
{
	public static void main(String Args[])
	{
		Employee e1=new Employee();
		e1.show("Pankaj",17,"Thane");
		
	}
}
class Employee
{
	String Name;
	int age;
	String City;
	void show(String Name,int age,String City)
	{
		this.Name=Name;
		this.age=age;
		this.City=City;
		System.out.println("The name is "+Name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+City);
	}
}