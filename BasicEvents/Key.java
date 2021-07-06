/*KeyEvents(Java KeyListener)*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code = Key width=600 height=600></applet>*/
public class Key extends Applet implements KeyListener{
	
	int X=40,Y=40;
	String msg="Key Events";
	public void init() {
		setBackground(Color.black);
		setForeground(Color.white);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke) {
		msg="Key Pressed  ";
		msg+=ke.getKeyChar();
		setBackground(Color.gray);
		showStatus("Key Pressed");
	}
	public void keyReleased(KeyEvent ke) {
		msg="Key Released  ";
		msg+=ke.getKeyChar();
		setBackground(Color.red);
		showStatus("Key Released");
		
	}
	public void keyTyped(KeyEvent ke) {
		msg="Key Typing is  ";
	    msg+=ke.getKeyChar();
		setBackground(Color.blue);
		showStatus("Key Typeded");
	}
	public void paint(Graphics g) {
		g.drawString(msg,X,Y);
	}
	

}
