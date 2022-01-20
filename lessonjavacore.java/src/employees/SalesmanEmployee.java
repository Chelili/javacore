package employees;

import utils.BonusSystem;

public class SalesmanEmployee extends Employee implements BonusSystem {


    public SalesmanEmployee(String name, int age, double salary, String hobby) {
        super(name, age, salary, hobby);
    }

    public SalesmanEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }


    public void doSales() {
    }


    @Override
    public void getBonus() {

    }
}

