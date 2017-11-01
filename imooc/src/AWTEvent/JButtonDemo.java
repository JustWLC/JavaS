package AWTEvent;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JButtonDemo {
	JFrame f=new JFrame("JButtonDemo3");
	Container contentPane=f.getContentPane();
	public  JButtonDemo(){
                                                                                                             
JButton b=new JButton("[O]打开新窗口");
b.setMnemonic('o');
b.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
		JFrame jf=new JFrame("新窗口");
		JLabel label=new JLabel("这是一个新窗口");
		label.setHorizontalAlignment(JLabel.CENTER);
		jf.getContentPane().add(label);
		jf.setSize(100, 100);
		jf.setVisible(true);
	}
});
f.add(b);
f.setSize(200, 200);
f.setVisible(true);

	}
	public static void main(String[] args){
		new JButtonDemo();
	}
	
}
