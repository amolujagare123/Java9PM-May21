package WrapperClassDemo;

public class StringConversion {

    public static void main(String[] args) {

        String str1 ="11";
        String str2 ="22";

        System.out.println(str1+str2);

        int a1 = Integer.parseInt(str1);
        int a2 = Integer.parseInt(str2);

        System.out.println(a1+a2);

        String str3 ="1.1";
        String str4 ="2.2";

        Double d1 = Double.parseDouble(str3);
        Double d2 = Double.parseDouble(str4);

        System.out.println(d1+d2);

        String str5 ="1.4f";
        String str6 ="2.6f";

        float f1 = Float.parseFloat(str5);
        float f2 = Float.parseFloat(str6);

        System.out.println(f1+f2);

        String str7 = "false";

        boolean b = Boolean.parseBoolean(str7);

        if(b)
            System.out.println("b is true");
        else
            System.out.println("b is false");

        String str ="d";

       // Homework - convert string to char

        int a =10 ;

        String str0 = ""+a;
        System.out.println("str0="+str0);

    }
}
