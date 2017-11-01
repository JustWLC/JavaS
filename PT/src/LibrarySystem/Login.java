package LibrarySystem;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
private   JLabel  JLb1=new JLabel("’À∫≈");   //username
private   JLabel JLb2=new JLabel("√‹¬Î");   //password
private JButton Jbt1;  //button for confirm
private JButton Jbt2;  //button for cancel
private JTextField JText;  //textfield for username
private JPasswordField JPass; //textfield for password
public void login(){
	JLb1=new JLabel("’À∫≈");
	JLb2=new JLabel("√‹¬Î");
	
JFrame jf =new JFrame("Library System");
Container contentPane=jf.getContentPane();
contentPane.setLayout(new BorderLayout());

contentPane.add(JLb1,BorderLayout.CENTER);
contentPane.add(JLb2, BorderLayout.SOUTH);

jf.setSize(400, 400);
jf.setVisible(true);
jf.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
});
}

}
