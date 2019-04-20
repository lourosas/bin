/////////////////////////////////////////////////////////////////////
/**/
import java.lang.*;
import java.util.*;
import rosas.lou.runnables.*;

public class BankTest{
   private static final int ACCOUNTS           = 100;
   //private static final int ACCOUNTS           = 10;
   private static final double INITIAL_BALANCE = 1000.0;

   public static void main(String [] args){
      new BankTest();
   }

   public BankTest(){
      Bookkeeper [] bookkeepers = new Bookkeeper[ACCOUNTS];
      Thread []     threads     = new Thread[ACCOUNTS];
      Bank bank = new Bank(ACCOUNTS, INITIAL_BALANCE);
      for(int i = 0; i < ACCOUNTS; i++){
         bookkeepers[i] = new Bookkeeper(bank, i);
         threads[i]     = new Thread(bookkeepers[i]);
         threads[i].start();//Start the threads...
      }
      try{
         for(int i = 0; i < ACCOUNTS; i++){
            threads[i].join();
         }
      }
      catch(InterruptedException ie){}
   }
}
/////////////////////////////////////////////////////////////////////
