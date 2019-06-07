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
	JFrame frame;
	JLabel label;
	String frameName,message;
	
    public Print(String frameName, String message){
    	frame = new JFrame(frameName);
    	label = new JLabel();
    	frameName=this.frameName;
    	message=this.message;
    }
    
    public void run() {
      frame.setLayout(new BorderLayout());
      frame.setLocation(100,100);
      frame.setSize(800,500);

      label.setText("                "+message);
      frame.add(label,BorderLayout.CENTER);
      frame.setVisible(true);
   }
}
