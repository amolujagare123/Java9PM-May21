package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        // 21/05/2021 - 21-05-2021 , 21-may-2021

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = sd.format(date);
        // date to string
        System.out.println(dateStr);


    }
}
