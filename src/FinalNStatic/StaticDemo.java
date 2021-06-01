package FinalNStatic;

public class StaticDemo {

    String name;
    int rno;
    static String college ="ITS";

    void display()
    {
        System.out.println("Name="+name);
        System.out.println("Rno="+rno);
        System.out.println("College="+college);
    }

    public static void main(String[] args) {

        StaticDemo s1 = new  StaticDemo();
        s1.name = "amol";
        s1.rno = 1;
        s1.college ="PICT";


        StaticDemo s2 = new  StaticDemo();
        s2.name = "Mithilesh";
        s2.rno = 2;



        StaticDemo s3 = new  StaticDemo();
        s3.name = "Hemangi";
        s3.rno = 3;
        s3.college = "xyz";


        StaticDemo.college = "ABC" ;

        s1.display();
        s2.display();
        s3.display();

    }

}
