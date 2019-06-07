import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.*;

public class User{

	private String name;
	private int money;
	private int rodLevel;

	User(String name,int money, int rodLevel){
		this.name = name;
		this.money = money;
		this.rodLevel = rodLevel;
	}
	public void setStore(int money) {
		this.money -= money;
	}

	public void setMoney(int money){
		this.money += money;
	}
	public int getMoney(){
		return money;
	}
	public void setRodLevel(int rodLevel){
		this.rodLevel = rodLevel;
	}
	public int getRodLevel(){
		return rodLevel;
	}
    public String getName(){
        return name;
    }
}
