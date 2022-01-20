package employees;

import utils.BonusSystem;
import utils.DebonusSystem;

public  class EngineerEmployee extends Employee implements BonusSystem,DebonusSystem {


    public EngineerEmployee(String name, int age, double salary, String hobby) {
        super(name, age, salary, hobby);

    }

    public EngineerEmployee(String name, int age, double salary) {
        super(name, age, salary);

    }

    public void doFix(){ }

    @Override
    public void debonus() {

    }

    @Override
    public void getBonus() {

    }

    public class Toolkit{
        boolean isActive;
    }

}
