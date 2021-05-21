package StringDemos;

public class StringReverse {
    // reverse the sting without using in buit functions

    public static void main(String[] args) {

        String str = "Selenium"; // muineleS

        String strRev ="";

        for(int i=str.length()-1; i>=0 ;i--)
        {
            strRev = strRev + str.charAt(i);
        }

        System.out.println(strRev);

    }

}
