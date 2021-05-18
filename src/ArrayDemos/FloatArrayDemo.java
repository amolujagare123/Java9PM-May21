package ArrayDemos;

public class FloatArrayDemo {

    public static void main(String[] args) {

        float[] f = new float[5];

        f[0] = 55.4f ;
        f[1] = 15.4f ;
        f[2] = 56.4f ;
        f[3] = 45.4f ;
        f[4] = 35.4f ;

        for(int i=0;i<f.length;i++)
            System.out.println(f[i]);


/*
        double[] d = new double[5];

        d[0] = 1.2;
        d[1] = 3.2;
        d[2] = 1.8;
        d[3] = 5.2;
        d[4] = 9.2;


        for(int i=0;i<d.length;i++)
        {
            System.out.println(d[i]);
        }*/
    }
}
