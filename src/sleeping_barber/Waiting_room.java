package sleeping_barber;

import java.awt.Button;
import java.util.concurrent.Semaphore;

import gui.BarberGui;


public class Waiting_room{

	
	
	
	 public Waiting_room() {   }
	 
	 
	 public static void takeASeat(Customer c,Button b,int id) throws InterruptedException {

		 int x = (int) BarberGui.pos[id][2].getX();
		 int y = (int) BarberGui.pos[id][2].getY();
		 b.setBounds(x, y, 20, 20);
			
	    }

}
