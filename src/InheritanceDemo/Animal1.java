package InheritanceDemo;

public class Animal1 {

    void eat()
    {
        System.out.println("eat");
    }
}

class  Mamal extends Animal1
{
    void iAmMamal()
    {
        System.out.println("iAmMamal");
    }
}

class Reptile extends Animal1
{
    void iAmReptile()
    {
        System.out.println("iAmReptile");
    }
}

class  Tiger extends  Mamal
{
    void iAmTiger()
    {
        System.out.println("iAmTiger");
    }
}

class TestInheritance2
{
    public static void main(String[] args) {

        Animal1 animal1 = new Animal1();
        animal1.eat();

        Mamal mamal = new Mamal();
        mamal.iAmMamal();
        mamal.eat();

        Reptile reptile = new Reptile();
        reptile.iAmReptile();
        reptile.eat();

        Tiger tiger = new Tiger();
        tiger.iAmTiger();
        tiger.iAmMamal();
        tiger.eat();


    }
}