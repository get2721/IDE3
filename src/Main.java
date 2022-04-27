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
        System.out.println("Enter 1 to create a Regular employee ");
        System.out.println("Enter 2 to create a Sales Employee ");
        System.out.println("Enter 3 to create a Manufacturing Employee ");
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
            System.out.println("Enter Employee City:");
            String city = inputDevice.nextLine();
            employee.setCity(city);
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
            System.out.println("Employee Information");
            System.out.println("Employee ID:" + employee.getId() + " Name:" + employee.getFirstName() + " " + employee.getLastName()
                    + " Address:" + employee.getAddress() + employee.getCity() + " " + employee.getState() + " Salary:$" + employee.getSalary());

        }// end Employee build
        if (employeeType == 2) {
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
                System.out.println("Enter Employee City:");
                String city = inputDevice.nextLine();
                employeeTerritory.setCity(city);
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
                System.out.println("Enter Employee Commission Percentage:");
                int commission = inputDevice.nextInt();
                employeeTerritory.setCommission(commission);
                //
                System.out.println("Does Employee have a Company Car: Yes or No ");
                String car = inputDevice.nextLine();
                employeeTerritory.setCar(car);

                //
                // Print out Employee Information
            System.out.println("Employee with Territory Information");
                System.out.println("Employee ID:" + employeeTerritory.getId() + " Name:"+ employeeTerritory.getFirstName() + " " + employeeTerritory.getLastName()
                        + " Address:" + employeeTerritory.getAddress() + " " + employeeTerritory.getCity() + " " + employeeTerritory.getState() + " Salary:$" + employeeTerritory.getSalary() + " Territory:"
                        + employeeTerritory.getTerritory() + " Commission:"  + employeeTerritory.getCommission() + " Company Car:" + employeeTerritory.getCar());
        }// end Employee with Territories build
         else {
            //
            System.out.println("Enter Employee ID:");
            int id = inputDevice.nextInt();
            EmployeeManufacturing employeeManufacturing = new EmployeeManufacturing();
            employeeManufacturing.setId(id);
            inputDevice.nextLine(); // required so not to skip the next question
            //
            //
            System.out.println("Enter Employee First Name:");
            String firstName = inputDevice.nextLine();
            employeeManufacturing.setFirstName(firstName);
            //
            System.out.println("Enter Employee Last Name:");
            String lastName = inputDevice.nextLine();
            employeeManufacturing.setLastName(lastName);
            //
            System.out.println("Enter Employee Street Address:");
            String address = inputDevice.nextLine();
            employeeManufacturing.setAddress(address);
            //
            System.out.println("Enter Employee City:");
            String city = inputDevice.nextLine();
            employeeManufacturing.setCity(city);
            //
            System.out.println("Enter Employee State:");
            String state = inputDevice.nextLine();
            employeeManufacturing.setState(state);
            //
            System.out.println("Enter Employee Salary:");
            int salary = inputDevice.nextInt();
            employeeManufacturing.setSalary(salary);
            inputDevice.nextLine(); // required so not to skip the next question
            //
            System.out.println("Enter Employee Shift:");
            String shift = inputDevice.nextLine();
            employeeManufacturing.setShift(shift);
            //
            System.out.println("Enter Employee Assigned Machine:");
            String machine = inputDevice.nextLine();
            employeeManufacturing.setMachine(machine);
            //
            System.out.println("Enter Employee Parts Quota:");
            int quota = inputDevice.nextInt();
            employeeManufacturing.setQuota(quota);
            //
            // Print out Employee Information
            System.out.println("Sales Employee Information");
            System.out.println("Employee ID:" + employeeManufacturing.getId() + " Name:"+ employeeManufacturing.getFirstName() + " " + employeeManufacturing.getLastName()
                    + " Address:" + employeeManufacturing.getAddress() + " " + employeeManufacturing.getCity() + " " + employeeManufacturing.getState() + "Salary:$" + employeeManufacturing.getSalary() + " Shift:"  + employeeManufacturing.getShift()
                    + " Assigned Machine:" + employeeManufacturing.getMachine() + " Parts Quota:" + employeeManufacturing.getQuota());
        }//ends the EmployeeSales build


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
