// Gage Tickle
// CSC - 201
//  Program collect information for different types of employees


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //create a scanner object to receive input
        Scanner inputDevice = new Scanner(System.in);
	// write your code here
        System.out.println("Time to enter details about your Employees. ");
       // do{
        System.out.println("Enter 1 to create an regular employee ");
        System.out.println("Enter 2 to create an  employee with Territories ");
        System.out.println("Enter 3 to create a Sales Employee ");
        int employeeType = inputDevice.nextInt();
        //this EmployeeWithTerritories
        inputDevice.nextLine();
        if (employeeType == 1) {
            //
            System.out.println("Enter Employee ID:");
            int id = inputDevice.nextInt();
            Employee employee = new Employee();
            employee.setId(id);
            inputDevice.nextLine(); // required so not to skip the next question
            //
            System.out.println("Enter Employee First Name:");
            String firstName = inputDevice.nextLine();
            employee.setFirstName(firstName);
            //
            System.out.println("Enter Employee Last Name:");
            String lastName = inputDevice.nextLine();
            employee.setLastName(lastName);
            //
            System.out.println("Enter Employee Street Address:");
            String address = inputDevice.nextLine();
            employee.setAddress(address);
            //
            System.out.println("Enter Employee State:");
            String state = inputDevice.nextLine();
            employee.setState(state);
            //
            System.out.println("Enter Employee Salary:");
            int salary = inputDevice.nextInt();
            employee.setSalary(salary);
            //
            // Print out Employee Information
            System.out.println("Employee ID: " + employee.getId() + " Name: " + employee.getFirstName() + " " + employee.getLastName()
                    + " Address: " + employee.getAddress() + " " + employee.getState() + " " + employee.getSalary());

        }// end Employee build
         else {
            //
                System.out.println("Enter Employee ID:");
                int id = inputDevice.nextInt();
                EmployeeWithTerritory employeeTerritory = new EmployeeWithTerritory();
                employeeTerritory.setId(id);
                inputDevice.nextLine(); // required so not to skip the next question
                //
                //
                System.out.println("Enter Employee First Name:");
                String firstName = inputDevice.nextLine();
                employeeTerritory.setFirstName(firstName);
                //
                System.out.println("Enter Employee Last Name:");
                String lastName = inputDevice.nextLine();
                employeeTerritory.setLastName(lastName);
                //
                System.out.println("Enter Employee Street Address:");
                String address = inputDevice.nextLine();
                employeeTerritory.setAddress(address);
                //
                System.out.println("Enter Employee State:");
                String state = inputDevice.nextLine();
                employeeTerritory.setState(state);
                //
                System.out.println("Enter Employee Salary:");
                int salary = inputDevice.nextInt();
                employeeTerritory.setSalary(salary);
                //
                System.out.println("Employee Territory's:");
                System.out.println("North East = 1");
                System.out.println("South East = 2");
                System.out.println("Mid West = 3");
                System.out.println("North West = 4");
                System.out.println("South West = 5");
                System.out.println("West = 6");
                System.out.println("Enter Employee Territory:");
                int territory = inputDevice.nextInt();
                employeeTerritory.setTerritory(territory);

                //
                // Print out Employee Information
                System.out.println("Employee ID: " + employeeTerritory.getId() + " Name: "+ employeeTerritory.getFirstName() + " " + employeeTerritory.getLastName()
                        + " Address: " + employeeTerritory.getAddress() + " " + employeeTerritory.getState() + " " + employeeTerritory.getSalary() + " Territory: "  + employeeTerritory.getTerritory());
        }//ends the electric car condition


// Test Code
/*
        Employee employee1 = new Employee();

        employee1.setId(1);
        employee1.setSalary(50_000.00);
        System.out.println("Here is Employee1: " + employee1.getId() + " "+ employee1.getSalary());


        EmployeeWithTerritory employeeTerritory = new EmployeeWithTerritory();

        employeeTerritory.setId(2);
        employeeTerritory.setSalary(40_000.00);
        employeeTerritory.setTerritory(50);

        System.out.println("Here is employee with Territory: ID: " + employeeTerritory.getId() + " SALARY: "
                + employeeTerritory.getSalary() + "Territory: " + employeeTerritory.getTerritory());
*/


    }
}
