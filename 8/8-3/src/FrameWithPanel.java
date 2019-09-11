import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameWithPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame with Panel");
		Container contentPane = frame.getContentPane();
		contentPane.setBackground(Color.cyan);
		JPanel panel = new JPanel();
		panel.setBackground(Color.yellow);
		JButton button = new JButton("Press me");
		panel.add(button);
		contentPane.add(panel, BorderLayout.SOUTH);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
