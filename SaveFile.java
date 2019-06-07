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
	User user;
	String fileName;
	PrintWriter outputStream;
	
   public SaveFile(User user){
	   this.user=user;
   }
   
   public void run() {
		  Print print=new Print("saveFile","Saved:)");
		  print.run();
		  
	      fileName= "user.txt";
	      outputStream= null;
	      
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
}
