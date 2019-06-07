import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class MyLabel extends JLabel{
    int fishPrice,barSize,maxBarSize,width;
    double fishWeight;
    String fishName,fishImage;
    String[] fishArray = {"Salmon", "Flatfish", "Squid", "Octopus", "Minnow", "Shrimp", "Carp", "Tuna", "Mackerel", "Saury"};
    JFrame fishingFrame;
    JButton button;
    MyPanel panel;
    JFrame Message;

    public MyLabel(int maxBarSize){
      barSize=0;
      this.maxBarSize=maxBarSize;
      Message = new JFrame();
    }

    public void setFrame(JFrame frame){
        this.fishingFrame = frame;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(0,216,255));
        width =(int)(((double)(this.getWidth()))/maxBarSize*barSize);

        if(width==0) return;
        g.fillRect(0,0,width,this.getHeight());
    }

    synchronized void fill(User user, int rnd, Timer timer){
      fishWeight = rnd % 10;
      fishPrice = (int)fishWeight * 10;
      fishName = fishArray[rnd%10];
      fishImage = "picture/" + fishName + ".jpg";

      if(barSize==maxBarSize){
          fishingFrame.dispose();
          try{
                timer.cancel();
                user.setMoney (rnd*10000);
                Message.pack();

                button = new JButton("Return to home");
                panel = new MyPanel(fishName,fishImage,fishWeight,fishPrice);

                Message.add(button,BorderLayout.SOUTH);
                Message.add(panel,BorderLayout.CENTER);

                Message.setLocation(100,100);
                Message.setSize(800,500);
                Message.setVisible(true);
              }
            catch(Exception e){
              System.out.println(e);
            }

            button.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    Message.dispose();
                }
            });
          }

        barSize++;
        this.repaint();
        this.notify();
    }

    synchronized void consume(){
        if(barSize==0){
            try{
                this.wait();
            }
            catch(Exception e){
                return;
            }
        }
        barSize--;
        this.repaint();
        this.notify();
    }

    class MyPanel extends JPanel{
      String fishName,fishImage;
      double fishWeight;
      int fishPrice;
      ImageIcon icon;
      Image img;

      public MyPanel(String fishName,String fishImage, double fishWeight,int fishPrice){
        this.fishName=fishName;
        this.fishImage=fishImage;
        this.fishWeight=fishWeight;
        this.fishPrice=fishPrice;
        icon=new ImageIcon(fishImage);
        img=icon.getImage();
      }

      public void paintComponent(Graphics g){
         super.paintComponent(g);
         g.drawImage(img,50,50,this.getWidth()-100,this.getHeight()-100, null);
         g.setFont(new Font("myFont",Font.BOLD ,40));
         g.setColor(new Color(95,0,255));
         g.drawString("       Success~!", 250, 40);
         g.setFont(new Font("secondFont",Font.PLAIN,25));
         g.setColor(Color.BLACK);
         g.drawString( "The fish you just caught: "+fishName+"  Weight: "+fishWeight+" kg  Price: "+fishPrice+" Won",10,430);
      }
   }

}
