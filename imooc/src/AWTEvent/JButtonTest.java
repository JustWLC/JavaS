package AWTEvent;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonTest {
public JButtonTest(){
	JFrame f=new JFrame("打开窗口");
	Container contentPane=f.getContentPane();
	contentPane.setLayout(new GridLayout(1,2));
	JButton b1=new JButton("打开一个文本窗口");
	JButton b2=new JButton("打开一个空窗口");
	f.getRootPane().setDefaultButton(b1);
	b1.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					JFrame newf=new JFrame("文字窗口");
					JLabel label=new JLabel("WELCOME");
					label.setHorizontalAlignment(JLabel.CENTER);
					newf.getContentPane().add(label);
					newf.setSize(200, 200);
					newf.setVisible(true);
				}
			});
	b2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					JFrame newf=new JFrame("空窗口");
					JLabel label=new JLabel();
					label.setHorizontalAlignment(JLabel.CENTER);
					newf.getContentPane().add(label);
					newf.setVisible(true);
					newf.setSize(200, 200);
				}
			}
			);
	contentPane.add(b1);
	contentPane.add(b2);
	f.setVisible(true);
	f.setSize(400, 200);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
	public static void main(String[] args){
		new JButtonTest();
	}
	
}

