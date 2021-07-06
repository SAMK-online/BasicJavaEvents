import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*applet code= Mouse width=600 height=600> </applet>*/
public class Mouse extends Applet implements MouseListener, MouseMotionListener {
	int X=30, Y=30;
	String msg="Mouse Events";
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.black);
		setForeground(Color.white);
	}
	public void mouseEntered(MouseEvent me) {
		msg="Mouse Moved";
		setBackground(Color.magenta);
		showStatus("Mouse Entered");
		repaint();
	}
	public void mouseExited(MouseEvent me) {
		msg="Mouse Exited";
		setBackground(Color.red);
		showStatus("Mouse Exited");
		repaint();
	}
	public void mousePressed(MouseEvent me) {
		msg="Mouse Pressed";
		setBackground(Color.red);
		showStatus("Mouse Pressed");
		repaint();
	}
	public void mouseReleased(MouseEvent me) {
		msg="Mouse Released";
		setBackground(Color.yellow);
		showStatus("Mouse Released");
		repaint();
	}	
	public void mouseMoved(MouseEvent me) {
		X=me.getX();
		Y=me.getY();
		msg="Mouse Moving";
		setBackground(Color.green);
		showStatus("Mouse Moved");
		repaint();
	}	
	public void mouseDragged(MouseEvent me) {
		msg="Mouse Dragged";
		setBackground(Color.gray);
		showStatus("Mouse Dragged at+("+me.getX()+","+me.getY()+")");
		repaint();
	}
	public void mouseClicked(MouseEvent me) {
		msg="Mouse Clicked";
		setBackground(Color.blue);
		showStatus("Mouse Clicked");
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg,X,Y);
	}
	
	
}	
