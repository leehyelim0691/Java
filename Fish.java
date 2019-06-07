import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;//
import javax.sound.sampled.*;

public class Fish{
	private String fishName;
	private int fishPrice;
	private double fishWeight;

	Fish(String fishName, double fishWeight, int fishPrice){
      this.fishName = fishName;
      this.fishWeight = fishWeight;
      this.fishPrice = fishPrice;
   }
   public int getfishPrice(){
      return fishPrice;
   }
}
