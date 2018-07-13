package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class BarberGui extends java.awt.Frame
{

public static Point[][] pos = new Point[10][4];
  

  public BarberGui()
  {
    super("SleepingBarber (Designed by K.Thramboulidis)");
    for (int i = 0; i < 10; i++)
      for (int j = 0; j < 4; j++)
        pos[i][j] = new Point();
    initialize();
    setLayout(null);
    setFont(new java.awt.Font("TimesRoman", 1, 20));
    setResizable(false);
    setBackground(Color.black);
    setSize(400, 300);
    setLocation(100, 100);
    setIconImage(null);
    addWindowListener(new HandleWindow());
    setVisible(true);
  }
  


  public void paint(Graphics g)
  {
    g.setColor(Color.white);
    g.drawRect(180, 0, 180, 150);
    g.drawLine(150, 70, 180, 120);
    g.drawRect(50, 150, 310, 130);
    g.drawLine(285, 120, 245, 150);
    
    g.setColor(Color.black);
    g.drawLine(180, 70, 180, 120);
    g.drawLine(245, 150, 285, 150);
    g.drawLine(85, 150, 125, 150);
    
    g.setColor(Color.blue);
    g.drawLine(305, 85, 335, 85);
    g.drawLine(335, 85, 335, 45);
    g.drawLine(320, 85, 320, 100);
    g.drawLine(320, 100, 312, 108);
    g.drawLine(320, 100, 328, 108);
    
    g.fillRect(335, 151, 25, 129);
    g.setColor(Color.white);
    g.drawLine(335, 178, 360, 178);
    g.drawLine(335, 203, 360, 203);
    g.drawLine(335, 228, 360, 228);
    g.drawLine(335, 253, 360, 253);
    
    g.setColor(Color.blue.darker());
    
    g.fillRect(215, 195, 20, 50);
    
    g.setColor(Color.white);
    g.setFont(new java.awt.Font("TimesRoman", 1, 18));
    g.drawString("Waiting Room", 185, 275);
  }
  

  private void initialize()
  {
    pos[0][0] = new Point(10, 25);
    pos[1][0] = new Point(35, 25);
    pos[2][0] = new Point(60, 25);
    pos[3][0] = new Point(85, 25);
    pos[4][0] = new Point(110, 25);
    pos[5][0] = new Point(10, 50);
    pos[6][0] = new Point(35, 50);
    pos[7][0] = new Point(60, 50);
    pos[8][0] = new Point(85, 50);
    pos[9][0] = new Point(110, 50);
    for (int i = 0; i < 10; i += 2) {
      pos[i][1] = new Point(95, 125 - i * 3);
      pos[(i + 1)][1] = new Point(85, 125 - i * 3);
    }
    pos[9][1] = new Point(95, 80);
    
    for (int i = 0; i < 10; i += 2) {
      pos[i][2] = new Point(336, 153 + i * 13);
      pos[(i + 1)][2] = new Point(330, 156 + i * 13);
    }
    pos[9][2] = new Point(325, 260);
    for (int i = 0; i < 10; i += 2) {
      pos[i][3] = new Point(305, 64 - i * 3);
      pos[(i + 1)][3] = new Point(310, 64 - i * 3);
    }
    pos[9][3] = new Point(305, 19);
  }
}