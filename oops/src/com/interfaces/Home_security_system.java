package com.interfaces;

interface Alarm{
	 void activate();
	 void deactivate();
}

class FireAlarm implements Alarm{
	public void activate(){
		System.out.println("Fire alarm is activated");
	}
	public void deactivate(){
		System.out.println("Fire alarm is deactivated");
	}
}

class BulgarAlarm implements Alarm{
	public void activate(){
		System.out.println("Bulgar alarm is activated");
	}
	public void deactivate(){
		System.out.println("Bulgar alarm is deactivated");
	}
}
public class Home_security_system {

	public static void main(String[] args) {
		 FireAlarm a1=new  FireAlarm();
		 a1.activate();
		 a1.deactivate();
		 BulgarAlarm a2=new  BulgarAlarm();
		 a2.activate();
		 a2.deactivate();
	}

}
