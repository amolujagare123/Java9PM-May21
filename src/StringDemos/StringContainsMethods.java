package StringDemos;

public class StringContainsMethods {

    public static void main(String[] args) {

        String str = "pune is in Maharashtra";

        System.out.println(str.endsWith("tra")); // true
        System.out.println(str.endsWith("dsds")); // false

        System.out.println(str.startsWith("pun")); // true
        System.out.println(str.startsWith("pun1")); // false

        System.out.println(str.contains("Mah")); // true
        System.out.println(str.contains("Mah1")); // false

    }
}
