// Gage Tickle
// CSC - 201
//  Program collect information for different types of employees
public class Employee
{
   //Varibles for All Employees
   private int id;
   private double salary;
   private String firstName;
   private String lastName;
   private String address;
   private String state;

   //Getters and Setters
   public int getId()
   {
      return id;
   }
   public double getSalary()
   {
      return salary;
   }
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return lastName;
   }
   public String getAddress()
   {
      return address;
   }
   public String getState()
   {
      return state;
   }
   public void setId(int idNum)
   {
      this.id = idNum;
   }
   public void setSalary(double sal)
   {
      salary = sal;
   }
   public void setFirstName(String firstName) { this.firstName = firstName;}
   public void setLastName(String lname) { lastName = lname;}
   public void setAddress(String add) { address = add;}
   public void setState(String st) { state = st;}
}// end Class

