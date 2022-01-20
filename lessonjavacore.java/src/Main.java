import employees.Employee;
import employees.EngineerEmployee;
import employees.SalesmanEmployee;

public class Main {

    public static void main(String[] args) {


        //Абстракция (абстрактные классы, интерфейсы)
        // Наследование
        // Инкапсуляция (модификаторы доступа)
        // Полиморфизм (переопределение, перегрузка)
        // static - final
        //Вложенные и внутренние классы
        //enum
        //Object

        EngineerEmployee employee1 = new EngineerEmployee("Slava", 25, 100000, "Футбол");
        SalesmanEmployee employee2 = new SalesmanEmployee("Vadim", 20, 50000, "Видеоигры");
        EngineerEmployee employee3 = new EngineerEmployee("Slava", 25, 100000);
        SalesmanEmployee employee4 = new SalesmanEmployee("Vadim", 20, 50000);

        System.out.println(Employee.count);

        System.out.println(employee1);
        System.out.println(employee2);
        String a = "hello";
        String b = "hell";
        b += "o";

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));
        System.out.println(employee1.equals(employee3));
        System.out.println(employee1.equals(employee2));



    }
}
