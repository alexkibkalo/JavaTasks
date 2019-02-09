package oop.task4.task_4_1;

public class EmployeeWithASalary extends Employee {
    private double salary;
    private double premiumPercent;

    public EmployeeWithASalary(String name, String passportData, String contract, double salary, double premiumPercent) {
        super(name, passportData, contract);
        this.salary = salary;
        this.premiumPercent = premiumPercent;
    }

    @Override
    public void toPaySalary() {
        System.out.println("Employee " + this.toString() + "\nGot " + (salary + premiumPercent));
    }

    @Override
    public String toString() {
        return getName() +
                ", Passport data: " + getPassportData() +
                ", Contract: " + getContract();
    }
}
