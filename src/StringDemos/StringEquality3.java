package StringDemos;

public class StringEquality3 {

    public static void main(String[] args) {

        String str1 = "amol";
        String str2 = "amol";
        String str3 = "Amol";
        String str4 = "xyz";
        String str5 = new String("amol");

        System.out.println(str1==str2); // true / false
        System.out.println(str1==str4);

        System.out.println(str1==str5);




    }
}
