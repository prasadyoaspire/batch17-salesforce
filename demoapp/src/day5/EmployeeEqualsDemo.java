package day5;

public class EmployeeEqualsDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "raj", 50000);
        Employee emp2 = new Employee(101, "raj", 50000);
        if(emp1.equals(emp2)) {
            System.out.println("both are equals");
        }
        else {
            System.out.println("both are not equals");
        }
    }
}
