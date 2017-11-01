package AWTEvent;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyMouseTest {
private Frame f;
private TextField tf;
public MyMouseTest(){
	f=new Frame("¼àÌýÆ÷");
	tf=new TextField();
}
public void show(){
	f.add(tf,"North");
	f.setVisible(true);
	f.setSize(300, 200);
	f.addMouseMotionListener(new TestMouseMotionListener());
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			f.setVisible(false);
			f.dispose();
			System.out.println("ÍË³ö");
			System.exit(0);
		}
	});
}
public class TestMouseMotionListener extends MouseMotionAdapter{
	public void mouseMoved(MouseEvent e,TextField tf){
		tf.setText("Êó±ê×ø±ê£ºX="+e.getX()+"Y="+e.getY());
	}
}
public static void main(String[] args){
	MyMouseTest mist=new MyMouseTest();
	mist.show();
}
}
