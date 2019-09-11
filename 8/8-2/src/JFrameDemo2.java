import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameDemo2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("JFrameDemo2");
		JButton button = new JButton("Press me");
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new BorderLayout());
		contentPanel.add(button, BorderLayout.CENTER);
		frame.setContentPane(contentPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
