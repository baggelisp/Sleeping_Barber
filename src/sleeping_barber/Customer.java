package sleeping_barber;

import java.awt.Button;
import java.awt.Color;
import java.util.Random;
import java.util.concurrent.Semaphore;

import gui.BarberGui;

public class Customer extends Thread{
	int ID;
	public Button b;
	public static Semaphore waitingSem = new Semaphore(4);  // waiting room for 4 seats

	public Customer(int id) throws InterruptedException {
		
		ID=id;
		Random rand = new Random();
		float r = (float) (rand.nextFloat() / 2f + 0.5);
		float g = (float) (rand.nextFloat() / 2f + 0.5);
		float bl = (float) (rand.nextFloat() / 2f + 0.5);
		
		b=new Button(Integer.toString(id));
		int x = (int) BarberGui.pos[ID][0].getX();
		int y = (int) BarberGui.pos[ID][0].getY();
		b.setBounds(x, y, 20, 20);
		b.setBackground(new Color(r, g, bl));
		Main.BGui.add(b);
	
	}
	
	public void run() {

			 for (int i=0;i<4;i++){
				 try {
						Thread.sleep((long)(Math.random() * 1000)); //sleep
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 try {
					Place_cust(b,i,ID);  //place customer to every seat
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }  
	}

	public void Place_cust(Button b,int position,int idnum) throws InterruptedException{

		if (position<2) {    //if position=0 or position =1
			int x = (int) BarberGui.pos[idnum][position].getX();
			int y = (int) BarberGui.pos[idnum][position].getY();
			b.setBounds(x, y, 20, 20);
			
		}
		else if(position==2) {			

			waitingSem.acquire(); //wait
			Waiting_room.takeASeat(this,b, idnum);

			
		}

		else if(position==3){

			Main.CutSem.acquire(); 			//wait
			Barber.cutHair(b,idnum);
			interrupt();
			
		}
	}

	
	

}
