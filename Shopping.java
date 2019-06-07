import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class Shopping{
    JLabel userName, userMoney, userRodLevel, shopName;
    JButton beginner, intermediate, advanced, tuition;
    JLabel beginnerPrice, intermediatePrice, advancedPrice, tuitionPrice;
    JFrame shop;

    public Shopping(User user, JFrame menu){
        userName = new JLabel("User Name: " + user.getName());
        userMoney = new JLabel("User Money: " + user.getMoney());
        userRodLevel = new JLabel("User RodLevel: " + user.getRodLevel());
        shopName = new JLabel("                  SHOP");

         beginner = new JButton("beginner");
         beginnerPrice = new JLabel("                 100000");
         intermediate = new JButton("intermediate");
         intermediatePrice = new JLabel("                 500000");
         advanced = new JButton("advanced");
         advancedPrice = new JLabel("                 1000000");
         tuition = new JButton("Tuition");
         tuitionPrice = new JLabel("                 3000000");

         shop = new JFrame("SHOP");
      }

      public void run(){
        shop.setLocation(100,100);
        shop.setSize(800,500);
        shop.setLayout(new GridLayout(1,4));

        userMoney.setBackground(new Color(92,209,229));




        shopName.setForeground(new Color(250,0,0));
        shopName.setOpaque(true); beginner.setBorderPainted(false);

        beginner.setBackground(new Color(92,209,229));
        beginner.setOpaque(true); beginner.setBorderPainted(false);
        intermediate.setBackground(new Color(103,153,255));
        intermediate.setOpaque(true); intermediate.setBorderPainted(false);
        advanced.setBackground(new Color(107,102,255));
        advanced.setOpaque(true); advanced.setBorderPainted(false);
        tuition.setBackground(new Color(200,200,255));
        tuition.setOpaque(true); tuition.setBorderPainted(false);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3,1));
        panel1.add(userName);
        panel1.add(beginner);
        panel1.add(beginnerPrice);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,1));
        panel2.add(userMoney);
        panel2.add(intermediate);
        panel2.add(intermediatePrice);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3,1));
        panel3.add(userRodLevel);
        panel3.add(advanced);
        panel3.add(advancedPrice);
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(3,1));
        panel4.add(shopName);
        panel4.add(tuition);
        panel4.add(tuitionPrice);

        shop.add(panel1);
        shop.add(panel2);
        shop.add(panel3);
        shop.add(panel4);

        shop.setVisible(true);


        beginner.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(user.getMoney()>100000){
                    user.setMoney(-100000);
                    user.setRodLevel(1);
                    new Print("Shopping","Success to buy beginner fishing rod");
                    shop.dispose();
                }
                else{
                    new Print("Shopping","Not enough balance!");
                    shop.dispose();
                }
            }
        });
        intermediate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(user.getMoney()>500000){
                    user.setMoney(-500000);
                    user.setRodLevel(2);
                    new Print("Shopping","Success to buy intermediate fishing rod");
                    shop.dispose();
                }
                else{
                    new Print("Shopping","Not enough balance!");
                    shop.dispose();
                }
            }
        });
        advanced.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(user.getMoney()>1000000){
                    user.setMoney(-1000000);
                    user.setRodLevel(3);
                    new Print("Shopping","Success to buy advanced fishing rod");
                    shop.dispose();
                }
                else{
                    new Print("Shopping","Not enough balance!");
                    shop.dispose();
                }
            }
        });
        tuition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(user.getMoney()>30000){
                    menu.dispose();
                    shop.dispose();
                    user.setMoney(-30000);
                    // new Print("YOU MADE IT","OMG YOU GOT ENOUGH MONEY FOR TUITION FOR HANDONG");

                    Timer timer = new Timer();
                    TimerTask task = new TimerTask(){
                        public void run(){
                            //실패메세지 남기기
                            Ending ending=new Ending();
                            ending.run();
                        }
                    };
                    timer.schedule(task, 800);
                }
                else
                    new Print("Shopping","Not enough balance!");
            }
        });
    }
  }
