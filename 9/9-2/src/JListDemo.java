import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JListDemo {
	JFrame frame = new JFrame("JList Demo");
	JList<String> list;
	DefaultListModel<String> listModel;
	JPanel panel;
	JTextField tf;
	JButton button;
	
	public void go() {
		listModel = new DefaultListModel<String>();
		listModel.addElement("one");
		listModel.addElement("two");
		listModel.addElement("three");
		listModel.addElement("four");
		list = new JList<String>(listModel);
		JScrollPane jsp = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		Container cp = frame.getContentPane();
		cp.add(jsp);
		tf = new JTextField(15);
		button = new JButton("add new item");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				listModel.addElement(tf.getText());
			}
		});
		panel = new JPanel();
		panel.add(tf);
		panel.add(button);
		cp.add(panel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
//		// 当前系统的风格
//		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
//		UIManager.setLookAndFeel(lookAndFeel);
		
		JListDemo ld = new JListDemo();
		ld.go();
	}
}
