package FinalNStatic;

public class StaticBlockDemo {

    static
    {
        System.out.println("inside static");
    }

    public static void main(String[] args) {

        System.out.println("inside main");
    }
}
