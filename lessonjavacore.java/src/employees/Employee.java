package employees;

public abstract class Employee {

    public static int count = 0;

    //private default protected public
    private String name;
    private int age;
    private double salary;
    private String hobby;
    private final String chorus ="Мы едины! Ура ура ура";

    //перегрузка конструктора - полиморфизм
    public Employee(String name, int age, double salary, String hobby) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hobby = hobby;
        count++;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        hobby = "Нет Хобби";
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public boolean equals(Object obj){
        Employee employee = (Employee) obj;
        boolean isNameEqual = this.name.equals(employee.name) ;
        boolean isAgeEqual = this.age ==employee.age ;
        return isNameEqual && isAgeEqual;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", hobby='" + hobby + '\'' +
                ", chorus='" + chorus + '\'' +
                '}';
    }
}
