package gui;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



class HandleWindow
 implements WindowListener
{
 HandleWindow() {}
 
 public void windowActivated(WindowEvent event) {}
 
 public void windowOpened(WindowEvent event) {}
 
 public void windowIconified(WindowEvent event) {}
 
 public void windowDeactivated(WindowEvent event) {}
 
 public void windowDeiconified(WindowEvent event) {}
 
 public void windowClosed(WindowEvent event) {}
 
 public void windowClosing(WindowEvent closeTheWindow)
 {
   System.exit(0);
 }
}