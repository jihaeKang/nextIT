package ch13_thread.issac;

import com.sun.javafx.scene.control.skin.CustomColorDialog;

public class customer extends Thread{
	private Issac issac = Issac.getInstance();
	private int count;
	private String name;
	
	public customer(int count, String name) {
		this.count = count;
		this.name = name;
	}
	
	@Override
	public void run() {
		issac.buyToast(count, name);
	}

}
