
public class Employee
{
private int Id;
private String Name;

public Employee(String Name,int Id)
{
 this.Name = Name;
this.Id = Id;
}

public void Display()
{
System.out.println("Id:" + Id + " -- " + Name);
}
}