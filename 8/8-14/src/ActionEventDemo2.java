import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ActionEventDemo2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ActionEventDemo2");
		MyButton b = new MyButton("Close");
		frame.getContentPane().add(b, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
