package StringDemos;

public class StringSplitDemo {

    public static void main(String[] args) {

        String str = "Selenium is a testing tool";

        String[] stArr = str.split(" ");

        for(int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);

    }
}
