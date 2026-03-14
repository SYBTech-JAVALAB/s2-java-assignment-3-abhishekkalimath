package Assign3;

import java.util.Scanner;

public class Employe {

    String name;
    int employeeId;
    double annualSalary;
    double hourlyRate;
    int hoursWorked;
    double baseSalary;
    double bonus;
    int overTime;
    double taxDeduction;

    // Add Employee
    public void addEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        name = sc.nextLine();

        System.out.println("Enter Employee Id:");
        employeeId = sc.nextInt();

        System.out.println("Enter Base Salary:");
        baseSalary = sc.nextDouble();

        System.out.println("Enter Annual Salary:");
        annualSalary = sc.nextDouble();

        System.out.println("Enter Hourly Rate:");
        hourlyRate = sc.nextDouble();

        System.out.println("Enter Hours Worked:");
        hoursWorked = sc.nextInt();

        System.out.println("Enter Bonus:");
        bonus = sc.nextDouble();

        System.out.println("Enter Tax Deduction:");
        taxDeduction = sc.nextDouble();

        System.out.println("Enter Overtime Hours:");
        overTime = sc.nextInt();
    }

    // Annual Salary
    void calculateSalary(double annualSalary) {
        double salary = annualSalary / 12;
        System.out.println("Monthly Salary (From Annual Salary): " + salary);
    }

    // Hours Worked & Rate
    void calculateSalary(double hourlyRate, int hoursWorked) {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Salary (Hourly): " + salary);
    }

    // With Deductions
    void calculateSalary(double baseSalary, double taxDeduction) {
        double salary = baseSalary - taxDeduction;
        System.out.println("Salary After Deduction: " + salary);
    }

    // With Bonus
    void calculateSalary(int employeeId, double bonus) {
        double salary = baseSalary + bonus;
        System.out.println("Salary with Bonus: " + salary);
    }

    // With Bonus and Deductions
    void calculateSalary(double baseSalary, double bonus, double taxDeduction) {
        double salary = (baseSalary + bonus) - taxDeduction;
        System.out.println("Salary with Bonus and Deduction: " + salary);
    }

    // With Overtime
    void calculateSalary(double baseSalary, double hourlyRate, int overTime) {
        double salary = baseSalary + (hourlyRate * overTime);
        System.out.println("Salary with Overtime: " + salary);
    }

    public static void main(String args[]) {

        Employe e1 = new Employe();

        e1.addEmployee();

        e1.calculateSalary(e1.annualSalary);
        e1.calculateSalary(e1.hourlyRate, e1.hoursWorked);
        e1.calculateSalary(e1.baseSalary, e1.taxDeduction);
        e1.calculateSalary(e1.employeeId, e1.bonus);
        e1.calculateSalary(e1.baseSalary, e1.bonus, e1.taxDeduction);
        e1.calculateSalary(e1.baseSalary, e1.hourlyRate, e1.overTime);
    }
}
