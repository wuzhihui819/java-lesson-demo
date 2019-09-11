import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class JComboBoxDemo {
	JFrame frame = new JFrame("JComboBox Demo");
	JComboBox<String> jcb1, jcb2;
	JTextArea ta = new JTextArea(0, 30);
	
	public void go() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		String[] itemList = {"one", "Two", "Three", "Four", "Five"};
		jcb1 = new JComboBox<String>(itemList);
		p1.add(jcb1);
		jcb1.setSelectedIndex(3);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched, "Uneditable JComboBox");
		p1.setBorder(border);
		jcb2 = new JComboBox<String>();
		jcb2.addItem("Six");
		jcb2.addItem("Seven");
		jcb2.addItem("Eight");
		jcb2.addItem("nine");
		jcb2.setEditable(true);
		p2.add(jcb2);
		border = BorderFactory.createTitledBorder(etched, "Editable JComboBox");
		p2.setBorder(border);
		JScrollPane jp = new JScrollPane(ta);
		p3.setLayout(new BorderLayout());
		p3.add(jp);
		border = BorderFactory.createTitledBorder(etched, "Results");
		p3.setBorder(border);
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox jcb = (JComboBox)e.getSource();
				if(jcb == jcb1) {
					jcb2.insertItemAt((String)jcb1.getSelectedItem(), 0);
					ta.append("\nItem " + jcb1.getSelectedItem() + " inserted");
				} else {
					ta.append("\n You selected item:" + jcb2.getSelectedItem());
					jcb2.addItem((String)jcb2.getSelectedItem());
				}
				
			}
		};
		jcb1.addActionListener(al);
		jcb2.addActionListener(al);
		p4.setLayout(new GridLayout(0, 1));
		p4.add(p1);
		p4.add(p2);
		Container cp = frame.getContentPane();
		cp.setLayout(new GridLayout(0, 1));
		cp.add(p4);
		cp.add(p3);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		JComboBoxDemo cbd = new JComboBoxDemo();
		cbd.go();
	}
}
