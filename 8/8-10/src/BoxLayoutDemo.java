import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxLayoutDemo {
	private JFrame frame;
	private JPanel pv, ph;
	void go() {
		frame = new JFrame("Box Layout example");
		Container contentPane = frame.getContentPane();
		pv = new JPanel();
		pv.setLayout(new BoxLayout(pv, BoxLayout.Y_AXIS));
		pv.add(new JLabel(" First"));
		pv.add(new JLabel(" Second"));
		pv.add(new JLabel(" third"));
		contentPane.add(pv, BorderLayout.CENTER);
		ph = new JPanel();
		ph.setLayout(new BoxLayout(ph, BoxLayout.X_AXIS));
		ph.add(new JButton("Yes"));
		ph.add(new JButton("No"));
		ph.add(new JButton("Cancel"));
		contentPane.add(ph, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		BoxLayoutDemo that = new BoxLayoutDemo();
		that.go();
	}
}
