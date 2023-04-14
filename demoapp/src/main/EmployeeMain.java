package main;

import java.time.LocalDate;

import bean.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmpId(101010);
        emp1.setName("Raj");
        emp1.setEmail("Raj@tmail.com");
        emp1.setDob(LocalDate.of(2020, 10, 30));

        System.out.println("EmpId: "+emp1.getEmpId());
        System.out.println("Name: "+emp1.getName());
        System.out.println("Email:"+emp1.getEmail());
        System.out.println("DOB: "+emp1.getDob());

    }
}
