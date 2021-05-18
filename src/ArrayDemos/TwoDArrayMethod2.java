package ArrayDemos;

public class TwoDArrayMethod2 {

    public static void main(String[] args) {

        int[][] a = {
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4}
        };
        // rows x cols --> 4 x 5
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
