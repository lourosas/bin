//////////////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import rosas.lou.runnables.*;

public class InitializableLaunchSystem implements Subscriber{
   //String file  = "C:\\Users\\Lou\\Documents\\SystemPaths.json";
   //String tFile = "C:\\Users\\Lou\\Documents\\Two.json";
   String file  = "/home/lou/Documents/SystemPaths.json";
   String fFile = "/home/lou/Doucments/Two.json";
   public static void main(String[] args){
      new InitializableLaunchSystem();
   }

   public InitializableLaunchSystem(){
      System.out.println("Hello World");
      LaunchSystem sys = new LaunchSystemZero();
      sys.addSubscriber(this);
      sys.initialize(file, true);
   }

   public void update(){}

   public void update(Object object){
      System.out.println("update(...)");
      System.out.println(object);
   }
}
//////////////////////////////////////////////////////////////////////
