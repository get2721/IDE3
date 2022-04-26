public class Main {

    public static void main(String[] args) {
	// write your code here


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


    }
}
