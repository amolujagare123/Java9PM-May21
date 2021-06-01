package FinalNStatic;

public class FinalVariableDemo {

    /*final*/ int speed = 100;

    void change()
    {
        speed = 150;
    }

    public static void main(String[] args) {

        FinalVariableDemo ob = new FinalVariableDemo();
        //ob.change();

        System.out.println(ob.speed);
    }

}
