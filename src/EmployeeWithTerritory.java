// Gage Tickle
// CSC - 201
//  Program collect information for different types of employees
public class EmployeeWithTerritory extends Employee
{
   //Varibles specific for Employees with Territories Assigned
   private int territory;
   private int commission;
   private String car;
   //Getters and Setters
   public int getTerritory()
   {
      return territory;
   }
   public void setTerritory(int terr)
   {
      territory = terr;
   }
   public int getCommission()
   {
      return commission;
   }
   public void setCommission(int comm)
   {
      commission = comm;
   }
   public  String getCar()
   {
      return car;
   }
   public void setCar(String car1)
   {
      car = car1;
   }


}// end Class
