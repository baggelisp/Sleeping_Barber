package sleeping_barber;

import java.util.concurrent.Semaphore;

import gui.BarberGui;
public class Main {
	
	public static Semaphore CutSem = new Semaphore(1);
	public static BarberGui BGui;
	public static Customer[] CustArr = new Customer[10];


	public static void main(String[] args) throws InterruptedException {


		BGui =new BarberGui();
		
		new Barber();

		for(int i=0;i<10;i++){
			newCust(i);

		}
	}
	
	
	public static void newCust(int id) throws InterruptedException{
		
		
		Thread.sleep((long)(Math.random() * 2000));
		Customer c=new Customer(id);
		CustArr[id]=c;
		CustArr[id].start();
		
	}
	

}
