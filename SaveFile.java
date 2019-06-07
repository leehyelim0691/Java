import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class SaveFile{
   public SaveFile(User user){
      new Print("saveFile","Saved:)");
      String fileName= "user.txt";
      PrintWriter outputStream= null;
      try{
      outputStream= new PrintWriter(fileName);
      }
      catch(FileNotFoundException f){
      System.out.println("Error opening the file"+ fileName);
      System.exit(0);
      }
      Scanner keyboard= new Scanner(System.in);
      outputStream.println(user.getMoney());
      outputStream.println(user.getRodLevel());
      outputStream.close();
   }
}//SaveFile
