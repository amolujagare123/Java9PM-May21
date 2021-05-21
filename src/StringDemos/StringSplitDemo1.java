package StringDemos;

public class StringSplitDemo1 {

    public static void main(String[] args) {

        String str = "Selenium is a testing tool and this tool is open source";

        String[] stArr = str.split("is");

        for(int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);

    }
}
