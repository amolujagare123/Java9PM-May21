package WrapperClassDemo;

public class DatatypeDemo {

    public static void main(String[] args) {

       // byte b = -129;

        //short s = - 32769;

        int a = 5; // premitive data type

        Integer ii1 = new Integer(a); // boxing or wrapping
        System.out.println("ii1="+ii1);

        Integer ii2 = new Integer(10);
        System.out.println("ii2="+ii2);

        Integer ii3 = a;
        Integer ii4 = 15; // autoboxing or autowrapping
        System.out.println("ii3="+ii3);
        System.out.println("ii4="+ii4);

        //  Integer ii1 = new Integer(a);
        // converting non premitive into premitive
        int a1 = ii1.intValue();// unboxing or unwrapping
        int a2 = ii1;// autounboxing or autounwrapping

    }
}
