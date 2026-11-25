//////////////////////////////////////////////////////////////////////
import java.lang.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Second{
   public static void main(String[] args){
      EventQueue.invokeLater(() -> 
         {
            JFrame frame = new SecondFrame();
            frame.setTitle("Should See an Image");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
   }
}

//////////////////////////////////////////////////////////////////////
