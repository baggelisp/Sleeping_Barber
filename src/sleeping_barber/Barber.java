package sleeping_barber;

import java.awt.Button;
import java.awt.Color;

import gui.BarberGui;

public class Barber{
	
	private static Button barberIcon;
	private static int numberOfCuts=0;
	
	
	public Barber(){
		barberIcon=new Button("B");
		barberIcon.setBounds(215,200, 20, 40);
		barberIcon.setBackground(Color.RED);
		Main.BGui.add(barberIcon);
	}
	

	
	public static void cutHair(Button b,int id) throws InterruptedException{
		
			goCut(barberIcon);
			numberOfCuts++;
			
			if (numberOfCuts>10) {			//After 9 cuts barber go to rest for 6 sec
				rest(barberIcon);
				Thread.sleep(6000);
				goCut(barberIcon);
				numberOfCuts=0;
			}
			
			int x = (int) BarberGui.pos[id][3].getX();		//place costumer to position 3
			int y = (int) BarberGui.pos[id][3].getY();
			b.setBounds(x, y, 20, 20);
			Customer.waitingSem.release(); //signal    **waiting room has new free seat
			
			try {
				Thread.sleep(3000);							//stay for hair cut for 3 sec
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

				Main.CutSem.release();			//the barber is free
				b.hide();						//remove the costumers button
		
				
				Main.newCust(id);				//create a new costumer with the same id
				
	

	}
	
	
	
	
	static void rest(Button b) {
		
		b.setBounds(215,200, 20, 40);

		
	}
	
	
	static void goCut(Button b) {
		b.setBounds(271,57, 30, 30);
	}

}
