import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class Ask{
  Frame frame;
  JButton button;
  JLabel label;
  JTextField text;
   Ask(User user){
     frame = new JFrame("askmenu");
     button = new JButton("ENTER");
     label = new JLabel();
     text = new JTextField();
   }

   public void run(){

      label.setText("<html>| Creator: How can I help you?<br/>| 1: Show me the fish list<br/>| 2: Show me the fishing nod list<br/>| 3: Show me the creators who made this prgoram<br/>| 4:Your current information</html>");

      frame.setLocation(100,100);
      frame.setSize(800,500);

      frame.setLayout(new BorderLayout());
      frame.add(label,BorderLayout.CENTER);
      frame.add(text,BorderLayout.SOUTH);
      frame.add(button,BorderLayout.EAST);

      frame.pack();
      frame.setVisible(true);

      button.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            new Help(text.getText(),user);
            frame.dispose();
         }
      });//button ActionListener
   }
}
