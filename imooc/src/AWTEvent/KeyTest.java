package AWTEvent;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyTest extends KeyAdapter
            implements ActionListener{
	JFrame jframe=null;
	JLabel label=null;
	JTextField jtext=null;
	String key=" ";
	public KeyTest(){
		jframe =new JFrame("键盘监听器示例");
		Container contentPane=jframe.getContentPane();
		contentPane.setLayout(new GridLayout(3,1));
		label=new JLabel("Welcome");
		jtext=new JTextField();
		jtext.requestFocus();
		jtext.addKeyListener(this);
		JButton b=new JButton("清除");
		b.addActionListener(this);
		contentPane.add(label);
		contentPane.add(jtext);
		contentPane.add(b);
		jframe.pack();
		jframe.setVisible(true);
		jframe.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	}
	public void actionPerformed(ActionEvent e){
		key="o";
		label.setText("");
		jtext.setText("");
		jtext.requestFocus();
	}
	/*public void KeyTyped(KeyEvent e){
		char c= e.getKeyChar();
		if(c=='o'){
			JFrame newf=new JFrame("这是输入o后弹出的新窗口");
			newf.setSize(600, 200);
			newf.setVisible(true);
		}
		key=key+c;
		label.setText(key);
	}*/
	public static void main(String[] args){
		new KeyTest();
	}

}
