package MethodDemo;

public class ArrayArgument {

    void  getMyArray(int[] a1)
    {
        for(int i=0; i<a1.length ; i++ )
        System.out.print(a1[i]+" ");

        System.out.println();
    }

    void getTwoDArray(String[][] s1)
    {
        for(int i =0; i<s1.length ; i++)
        {
            for(int j=0;j<s1[0].length ; j++)
            {
                System.out.print(s1[i][j]+" ");
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {

        int[] x ={12,54,3,11,22,66,23,67};

        ArrayArgument ob = new ArrayArgument();
        ob.getMyArray(x);
        
        String[][] strr = {
                {"abc1","pqr1","xyz1"} ,
                {"abc2","pqr2","xyz2"} ,
                {"abc3","pqr3","xyz3"} ,
                {"abc4","pqr4","xyz4"}

        };

        ob.getTwoDArray(strr);


    }
}
