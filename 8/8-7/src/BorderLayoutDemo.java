import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo {
	private JFrame frame;
	private JButton be, bw, bn, bs, bc;
	void go() {
		frame = new JFrame("Border Layout");
		be = new JButton("East");
		bs = new JButton("South");
		bw = new JButton("West");
		bn = new JButton("North");
		bc = new JButton("Center");
		frame.getContentPane().add(be, BorderLayout.EAST);
		frame.getContentPane().add(bs, BorderLayout.SOUTH);
		frame.getContentPane().add(bw, BorderLayout.WEST);
		frame.getContentPane().add(bn, BorderLayout.NORTH);
		frame.getContentPane().add(bc, BorderLayout.CENTER);
		frame.setSize(350, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		BorderLayoutDemo that = new BorderLayoutDemo();
		that.go();
	}
}
