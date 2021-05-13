public class Triangle {

    public static void main(String[] args) {

        int a = 30;
        int b = 90;
        int c = 60;

        if(a+b+c==180 && a>0 && b>0 && c>0) {

            if (a == b && b == c) // equilateral triangle
                System.out.println("equilateral triangle");

            if (a != b && b != c)
                System.out.println("Scalane triangle");

            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angled triangle");

            if ((a == b && a != c) || (b == c && c != a) || (c == a && a != b))
                System.out.println("Isoscelence triangle");
        }
        else
            System.out.println("This is not a triangle");

    }
}
