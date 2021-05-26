package InheritanceDemo;

public class Animal {

    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends  Animal
{
    void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog extends Dog
{
    void weep()
    {
        System.out.println("weep");
    }

}

class  TestInheritance
{
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();

    }
}