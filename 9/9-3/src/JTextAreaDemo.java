import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class JTextAreaDemo {
	JFrame frame = new JFrame("JTextArea Demo");
	JTextArea ta1, ta2;
	JButton copy, clear;

	public void go() {
		ta1 = new JTextArea(3, 15);
		ta2 = new JTextArea(7, 20);
		ta2.setEditable(false);
		JScrollPane jsp1 = new JScrollPane(ta1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		JScrollPane jsp2 = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		copy = new JButton("Copy");
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ta1.getSelectedText() != null) {
					ta2.append(ta1.getSelectedText() + "\n");
				} else {
					ta2.append("\n" + ta1.getText() + "\n");
				}
			}
		});
		
		clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta2.setText("");
				
			}
		});
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		Border etchedBase = BorderFactory.createEtchedBorder();
		Border etched1 = BorderFactory.createTitledBorder(etchedBase, "������");
		Border etched2 = BorderFactory.createTitledBorder(etchedBase, "������");
		panel1.setBorder(etched1);
		panel2.setBorder(etched2);
		panel1.add(jsp1);
		panel1.add(copy);
		panel2.add(jsp2);
		panel2.add(clear);
		Container cp = frame.getContentPane();
		cp.add(panel1, BorderLayout.CENTER);
		cp.add(panel2, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JTextAreaDemo tad = new JTextAreaDemo();
		tad.go();
	}
}
