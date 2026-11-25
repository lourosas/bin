//////////////////////////////////////////////////////////////////////
///
import java.lang.*;
import java.util.*;

public class Hello{
   public static void main(String[] args){
      new Hello();
   }

   public Hello(){
      String hello = new String("Hello World");
      System.out.println(hello);
      for(int i = 0; i < hello.length(); ++i){
         System.out.print("=");
      }
      System.out.println();
   }
}
//////////////////////////////////////////////////////////////////////
