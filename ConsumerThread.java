import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;


public class ConsumerThread extends Thread{
    MyLabel con;
    ConsumerThread(MyLabel con){
        this.con=con;
    }
    public void run(){
        while(true){
            try{
                sleep(500);
                con.consume();
            }
            catch(Exception e){
                return;
            }
        }
    }
}