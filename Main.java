import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

class Main{
   public static int money;
   public static int rodLevel;
   private static String userName;

   public static void main(String[] args){
      //String[] fishArray = {"Salmon", "Flatfish", "Squid", "Octopus", "Minnow", "Shrimp", "Carp", "Tuna", "Mackerel", "Saury"};
      //Random random = new Random();
      LoadFile loadFile =new LoadFile();
      loadFile.run();
      Sound sound = new Sound();
      sound.playSound(new File("music/UTSS.wav"), 1.0f, true);
      Intro intro = new Intro(sound);
      intro.run();

   }
   public static void setUserName(String userName) {
      Main.userName = userName;
   }
}
