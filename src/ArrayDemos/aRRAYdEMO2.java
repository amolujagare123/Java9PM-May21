package ArrayDemos;

public class aRRAYdEMO2 {

    public static void main(String[] args) {

        double[][]d= {
                {12.33, 23.44, 24.54, 65.65 },
                {42.43, 93.44, 84.54, 75.65 },
                {32.53, 83.44, 84.54, 95.65 },
                {22.63, 73.44, 94.54, 05.65 },
        };

        double row=d.length;
        double col=d[0].length;

        for(int i=0;i<d.length;i++) {
            for (int j = 0; j < d[0].length; j++) {
                System.out.print(d[i][j] + "   ");
            }
            System.out.println();
        }
            System.out.println();
            char ch[][]= {
                    { 'd' ,'o' ,'h' ,'g', 'h' },         //error
                    { 'v', 'l' ,'y' ,'g' ,'h' },        //error

                    { 'h', 'k' ,'b' ,'g', '@' },          //error
                    { 'k' ,'l', 'b', 'g', '$' },               //error


            };

            for(int i=0;i<ch.length;i++)               //error
            {
                for (int j = 0; j < ch[0].length; j++) {
                    System.out.print(ch[i][j] + " ");           //error
                }
                System.out.println();
            }
                System.out.println();
                String [][]str= {
                        { "mithlesh", "kumar", "raju" ,"india" },      //error
                        { "hithlesh", "kumar", "baju", "india" },       //error
                        { "kithlesh", "kumar" ,"naju" ,"india" },           //error
                        { "lithlesh", "kumar", "kaju", "india" },      //error
                };


                for(int i=0;i<str.length;i++)
                {
                    for(int j=0;j<str[0].length;j++)
                    {
                        System.out.print(str[i][j] +    "   ");
                    }
                    System.out.println();

                }



            }


}
