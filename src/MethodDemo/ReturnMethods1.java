package MethodDemo;

public class ReturnMethods1 {

    String[][] getMyString()
    {
        String[][] s = {
                {"abc1","pqr1","xyz1"} ,
                {"abc2","pqr2","xyz2"} ,
                {"abc3","pqr3","xyz3"} ,
                {"abc4","pqr4","xyz4"}

        };

        return  s;
    }

    public static void main(String[] args) {

        ReturnMethods1 ob = new ReturnMethods1();

        String[][] stArr  = ob.getMyString();

        for(int i=0;i<stArr.length ;i++)
        {
            for(int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
