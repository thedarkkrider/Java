
public class Salary extends Employee
{
private int Salary;
private String Destination;

public Salary(String Name, int Id,String Des,int Salary)
{ 
 super(Name,Id);
this.Destination = Des;
this.Salary = Salary;
}
public void Display()
{
System.out.println("Id:" + Id + " -- " + Name + Destination + "$" + Salary);
}
}