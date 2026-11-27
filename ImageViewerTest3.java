import java.lang.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import rosas.lou.corejava.ImageViewer3;

public class ImageViewerTest3{
   public static void main(String[] args){
      new ImageViewerTest3();
   }

   public ImageViewerTest3(){
      String hello = new String("Hello World");
      System.out.println(hello);
      for(int i = 0; i < hello.length(); ++i){
         System.out.print("=");
      }
      System.out.println();
      new ImageViewer3();
   }
}
