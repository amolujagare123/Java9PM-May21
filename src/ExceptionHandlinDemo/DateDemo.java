package ExceptionHandlinDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        
        String dateStr = "12/02/2020";

        SimpleDateFormat sd = new SimpleDateFormat("dd/ MM/yyyy");
        
        Date date = null;
       
      //  try {
            date = sd.parse(dateStr);
     /*   }
        catch (Exception e)
        {
            e.printStackTrace();
        }*/

        System.out.println(date);

        System.out.println("end of the program");
    }
}
