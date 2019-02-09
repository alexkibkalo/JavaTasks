package oop.task4.task_4_1;

abstract public class Employee extends Citizen {
    private String contract;

    Employee(String name, String passportData, String contract) {
        super(name, passportData);
        this.contract = contract;
    }

    String getContract() {
        return contract;
    }

    abstract public void toPaySalary();
}
