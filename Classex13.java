import java.awt.Graphics;

import javax.swing.JApplet;

public class Classex13 extends JApplet{
	public void paint(Graphics canvas){
		canvas.drawLine(200, 375, 500, 375);
		canvas.drawLine(200, 275, 500, 275);
		canvas.drawLine(300, 500, 300, 150);
		canvas.drawLine(400, 500, 400, 150);
		canvas.drawLine(215, 164, 285, 260);
		canvas.drawLine(285, 164, 215, 260);
		canvas.drawLine(315, 164, 385, 260);
		canvas.drawLine(385, 164, 315, 260);
		canvas.drawLine(415, 164, 485, 260);
		canvas.drawLine(485, 164, 415, 260);
		canvas.drawLine(215, 165, 285, 260);
		canvas.drawLine(190, 212, 510, 212);
		canvas.drawLine(215, 280, 285, 370);
		canvas.drawLine(285, 280, 215, 370);
		canvas.drawLine(415, 390, 485, 485);
		canvas.drawLine(485, 390, 415, 485);
		canvas.drawOval(315, 290, 70, 70);
		canvas.drawOval(415, 290, 70, 70);
		canvas.drawOval(315, 390, 70, 70);
		canvas.drawOval(215, 390, 70, 70);
		canvas.drawString("Tic Tac Toe", 200, 100);
		canvas.drawString("Java Applet", 200, 120);
	}
}
