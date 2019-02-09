package oop.task4.task_4_1;

public class EmployeeWithSalaryAtTheHour extends Employee {
    private double salaryAtTheHour;
    private int numberOfHours;

    public EmployeeWithSalaryAtTheHour(String name, String passportData, String contract, double salaryAtTheHour, int numberOfHours) {
        super(name, passportData, contract);
        this.salaryAtTheHour = salaryAtTheHour;
        this.numberOfHours = numberOfHours;
    }

    @Override
    public void toPaySalary() {
        System.out.println("Employee " + this.toString() + "\nGot " + (salaryAtTheHour * numberOfHours));
    }

    @Override
    public String toString() {
        return getName() +
                ", Passport data: " + getPassportData() +
                ", Contract: " + getContract() +
                ", Number hours: " + numberOfHours;
    }
}
