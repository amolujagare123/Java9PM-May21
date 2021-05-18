package ArrayDemos;

public class TwoDiAraay {

    public static void main(String[] args) {

        int[][] a = new int[4][3]; // rows x col

        a[0][0] = 34;
        a[0][1] = 36;
        a[0][2] = 46; // 1st row

        a[1][0] = 24;
        a[1][1] = 26;
        a[1][2] = 26;  // 2nd row

        a[2][0] = 31;
        a[2][1] = 26;
        a[2][2] = 41;  // 3rd row

        a[3][0] = 54;
        a[3][1] = 66;
        a[3][2] = 76;  // 4th row

        // rows --> 4 | col -> 3

        int row = a.length;
        int col = a[0].length;

        System.out.println("rows="+row);

        System.out.println("col="+col);

        for(int i=0; i<row ;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }


    }
}
