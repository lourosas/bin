//////////////////////////////////////////////////////////////////////
//
//
//
import java.lang.*;
import java.util.*;
import rosas.lou.runnables.*;

public class TestCoffeeMaker{
   public static void main(String [] args){
      new TestCoffeeMaker();
   }

   public TestCoffeeMaker(){
      System.out.println("Hello World");
      Maker maker = new Maker();
      try{
         Thread.sleep(1600);
         try{
            maker.brew(100.);
         }
         catch(AlreadyBrewingException ab){
            System.out.println(ab.getMessage());
         }
         Thread.sleep(10550);
         try{
            maker.brew(28.);
         }
         catch(AlreadyBrewingException ab){
            System.out.println(ab.getMessage());
         }
         Thread.sleep(45000);
         CarafeInterface cI = maker.pullCarafe();
         cI.pour(new Mug());
         Thread.sleep(6000);
         //This is where the "Fun begins"!
         CarafeInterface cI2 = maker.pullCarafe();
         //Want to make sure it is the same carafe...
         cI2.pour(new Mug());
         //cI.stopPour();
         Thread.sleep(300);
         maker.returnCarafe();
         /*
         maker.pullCarafe();
         Thread.sleep(3200);
         maker.returnCarafe();
         */
         Thread.sleep(8110);
         //Final Sleep for 10 minutes...prior to shutting down
         //the power--that way, I can kill it earlier as needed...
         //Thread.sleep(600000);
      }
      catch(InterruptedException ie){}
      catch(NullPointerException npe){ npe.printStackTrace(); }
      finally{
         maker.power(false);
      }
   }
}
//////////////////////////////////////////////////////////////////////
