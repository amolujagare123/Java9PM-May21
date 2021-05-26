package InheritanceDemo;

public class Employee {

    int salary=15000;

    void method1()
    {
        System.out.println("inside Employee method-1");
    }
}

class Programmer extends Employee
{
    int bonus = 2000;

    void method2()
    {
        System.out.println("inside Programmer method-2");
    }

    public static void main(String[] args) {

        Programmer p = new Programmer();
        System.out.println("bonus="+p.bonus);
        p.method2();

        System.out.println("Salary="+p.salary);
        p.method1();
    }
}
