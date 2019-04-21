import java.lang.*;
import java.util.*;
import java.text.*;

public class TestElapsedTime{
   Calendar  start   = null;
   long startMillis  =   -1;

   public static void main(String [] args){
      new TestElapsedTime();
   }

   public TestElapsedTime(){
      int DAY_DIFF = 1;
      int EPOCH    = 1970;
      start = Calendar.getInstance();
      System.out.println("Hello World");
      startMillis = start.getTimeInMillis();
      //System.out.println(startMillis);
      //System.out.println(start);
      try{
         for(;;){
            Thread.sleep(2000);
            //System.out.println(startMillis);
            Calendar current = Calendar.getInstance();
            TimeZone tz      = TimeZone.getTimeZone("UTC");
            current.setTimeZone(tz);
            long currentMillis = current.getTimeInMillis();
            //System.out.println(currentMillis);
            //System.out.println(currentMillis - startMillis);
            current.setTimeInMillis(currentMillis-this.startMillis);
            /*
            System.out.println(current.get(Calendar.SECOND));
            System.out.println(current.get(Calendar.MINUTE));
            System.out.println(current.get(Calendar.HOUR_OF_DAY));
            System.out.println(current.get(Calendar.DAY_OF_YEAR)-1);
            System.out.println(current.get(Calendar.YEAR) - 1970);
            System.out.println(current);
            */
            int secs = current.get(Calendar.SECOND);
            int mins = current.get(Calendar.MINUTE);
            int hrs  = current.get(Calendar.HOUR_OF_DAY);
            int days = current.get(Calendar.DAY_OF_YEAR) - DAY_DIFF;
            int yrs  = current.get(Calendar.YEAR) - EPOCH;
            String timeString  = new String(yrs + " Years ");
            timeString        += days + " Days ";
            timeString        += timeString.format("%02d:", hrs);
            timeString        += timeString.format("%02d:", mins);
            timeString        += timeString.format("%02d",  secs);
            System.out.println(timeString);
         }
      }
      catch(InterruptedException ie){ ie.printStackTrace(); }
   }
}
