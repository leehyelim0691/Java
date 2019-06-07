import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class Print{
    public Print(String frameName, String message){
      JFrame frame = new JFrame(frameName);
      frame.setLayout(new BorderLayout());
      frame.setLocation(100,100);
      frame.setSize(800,500);

      JLabel label = new JLabel();
      label.setText("                "+message);
      frame.add(label,BorderLayout.CENTER);
      frame.setVisible(true);
   }//Print()
}//Print
