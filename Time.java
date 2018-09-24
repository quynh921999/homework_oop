/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Time {
    private int hour, minute, second;
    private String type; // AM or PM
    public Scanner input;
    Time(int hour, int minute, int second, String type) {
	this.setHour(hour);
	this.setMinute(minute);
	this.setSecond(second);
	this.setType(type);
	}
    Time() {
        input = new Scanner(System.in);
    }
    public int getHour() {
	return hour;
    }
    public void setHour(int hour) {
  	this.hour = hour;
    }
    public int getMinute() {
	return minute;
    }
    public void setMinute(int minute) {
	this.minute = minute;
    }
    public int getSecond() {
	return second;
    }
    public void setSecond(int second) {
	this.second = second;
    }
    public String getType() {
	return type;
    }
    public void setType(String type) {
	this.type = type;
    }
    public void nhapTg() {
	String s = input.nextLine();
        String [] tempArrays = s.split(":");
        String hh = tempArrays[0];
        String mm = tempArrays[1];
        String ss = tempArrays[2].substring(0,2);
        String t = tempArrays[2].substring(2,4);
        this.setHour(Integer.parseInt(hh));
        this.setMinute(Integer.parseInt(mm));
        this.setSecond(Integer.parseInt(ss));
        this.setType(t);
    }
    public void toiUuTG() {
	if (this.getType().equalsIgnoreCase("PM")) {
            if (this.getHour() < 12){
		this.setHour(this.getHour() + 12);
            }
	} else {
            if (this.getHour() == 12) {
		this.setHour(00);
		}
	}
		
	}
    public void inTg() {
	System.out.println(this.getHour() + ":" + this.getMinute() + ":" + this.getSecond());
	}   
}
