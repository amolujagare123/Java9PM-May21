package StringDemos;

public class StringEquality {

    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "xyz";
        String str5 = new String("amol");

        /*int a = 10;
        int b = 10 ;
        System.out.println(a==b) ; // true / false

        char c1 = 'g';
        char c2 = 'g';
        System.out.println(c1==c2); // true

        double d1 =1.2;
        double d2 = 1.5;
        System.out.println(d1 == d2 ); // false*/

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); //  false
        System.out.println(str1.equalsIgnoreCase(str3)); // true / false
        // amol &  Amol
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));

    }
}
