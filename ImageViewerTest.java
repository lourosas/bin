//////////////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import rosas.lou.corejava.ImageViewerFrame;

public class ImageViewerTest{
   public static void main(String[] args){
      new ImageViewerTest();
   }

   public ImageViewerTest(){
      String hello = new String("Hello World");
      System.out.println(hello);
      for(int i = 0; i < hello.length(); ++i){
         System.out.print("=");
      }
      System.out.println();
      EventQueue.invokeLater(() -> 
            {
               JFrame frame = new ImageViewerFrame();
               frame.setTitle("Image Viewer");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            });
   }
}
//////////////////////////////////////////////////////////////////////
