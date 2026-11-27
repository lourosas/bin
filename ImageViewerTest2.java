import java.lang.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import rosas.lou.corejava.ImageViewerFrame2;

public class ImageViewerTest2{
   public static void main(String[] args){
      new ImageViewerTest2();
   }

   public ImageViewerTest2(){
      String hello = new String("Hello World");
      System.out.println(hello);
      for(int i = 0; i < hello.length(); ++i){
         System.out.print("=");
      }
      System.out.println();
      EventQueue.invokeLater(() -> 
            {
               JFrame frame = new ImageViewerFrame2("Image Viewer 2");
               //frame.setVisible(true);
            });
   }
}
//////////////////////////////////////////////////////////////////////
