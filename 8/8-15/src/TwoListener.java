import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TwoListener implements MouseMotionListener, MouseListener{

	private JFrame frame;
	private JTextField tf;
	
	public void go() {
		frame = new JFrame("Two Listeners example");
		Container contentPane = frame.getContentPane();
		contentPane.add(new JLabel("Click and drag the mouse"), BorderLayout.NORTH);
		tf = new JTextField(30);
		contentPane.add(tf, BorderLayout.SOUTH);
		frame.addMouseMotionListener(this);
		frame.addMouseListener(this);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		TwoListener two = new TwoListener();
		two.go();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		String s = "The mouse entered";
		tf.setText(s);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		String s = "The mouse has left the building";
		tf.setText(s);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		String s = "Mouse dragging: X=" + e.getX() + "Y=" + e.getY();
		tf.setText(s);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
