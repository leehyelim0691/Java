import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class FishingIntro{

  private String[] fishArray = {"Salmon", "Flatfish", "Squid", "Octopus", "Minnow", "Shrimp", "Carp", "Tuna", "Mackerel", "Saury"};
  private int randomInt =0;
  private double fishWeight =0.0;
  private int fishPrice =0;
  private Fish fish = new Fish(fishArray[randomInt], fishWeight, fishPrice);
  //private Fishing fishing = new Fishing();
    public FishingIntro(User user){
      JFrame frame = new JFrame("Fishing");
      JTextField name = new JTextField();
      JButton enter = new JButton("ENTER");

      frame.setLocation(100,100);
      frame.setSize(800,500);
      frame.setLayout(null);

      MyPanel panel = new MyPanel();
      frame.add(panel);
      frame.setVisible(true);
      panel.setBounds(0,0,800,500);
      MyPanel2 panel2 = new MyPanel2();
      panel2.setBounds(350,300,100,100);
      //frame.add(panel2);
      frame.setVisible(true);
    }
    class MyPanel extends JPanel{
      ImageIcon icon=new ImageIcon("picture/sea.jpg");
      Image img=icon.getImage();

      public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
         //g.drawImage(img,0,0,350,450, null);
         g.setFont(new Font("myFont",Font.BOLD ,50));
         g.setColor(Color.BLACK);
         g.drawString("Let's start", 200, 70);
         g.setFont(new Font("secondFont",Font.PLAIN,20));
         g.setColor(Color.WHITE);
         g.drawString("Enter the key",10,100);
      }
   }

   class MyPanel2 extends JPanel{
     ImageIcon icon=new ImageIcon("picture/fishicon2.png");
     Image img=icon.getImage();

     public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img,0,0, 100,100, null);
     }
  }

}
