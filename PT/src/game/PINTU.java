package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PINTU extends JFrame {
	private JLabel modelLabel;
	private JPanel centerPanel;
	private JButton emptyButton;
	int num=0;
	
	public static void main(String[] args){
		try{
			PINTU frame=new PINTU();
			frame.setVisible(true);
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
//建立窗口构造方法
public PINTU(){
	super();
	setResizable(true);//设置此窗体是否可由用户调整大小
	setTitle("拼图游戏");
	setBounds(570,400,380,525);  //移动组件并调整其大小
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置用户在此窗体上发起“close”时默认执行的操作
	  
	//创建面板对象,并增加边框布局
	final JPanel topPanel=new JPanel();
	topPanel.setBorder(new TitledBorder(null,"Welcome Use",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,null,Color.BLUE));
	/*TitledBorder(Border border,String title,int titleJustification,int titlePosition,Font titleFont,Color titlecolor)
	 用指定的边框、标题、标题对齐方式、标题位置、标题字体和标题颜色创建TitledBorder实例*/
	topPanel.setLayout(new BorderLayout());
	getContentPane().add(topPanel,BorderLayout.NORTH);
	//创建标签放原图
	modelLabel =new JLabel();
	modelLabel.setIcon(new ImageIcon("image/"+num+"model.jpg"));
	//JLabel.setIcon(Icon icon)定义此组件将要显示的图标
	//ImageIcon() 创建一个未初始化的图像图标
	//swing.ImageIcon.ImageIcon(String filename) 根据指定的文件创建一个ImageIcon
	topPanel.add(modelLabel, BorderLayout.WEST);
	//在右侧加个面板，添加两个按钮
	JPanel eastPanel=new JPanel();
	topPanel.add(eastPanel, BorderLayout.CENTER);
	eastPanel.setLayout(new BorderLayout());
	JButton nextButton=new JButton();
	nextButton.setText("下一张");
	
	nextButton.addActionListener(new NextButtonAction());
	eastPanel.add(nextButton,BorderLayout.NORTH);
	//创建按钮开局添加监听
	final JButton startButton=new JButton();
	startButton.setText("开始");
	startButton.addActionListener(new StartButtonAction());
	eastPanel.add(startButton, BorderLayout.CENTER);
	//初始化中心面板，设置边框，添加按钮
	centerPanel=new JPanel();
	centerPanel.setBorder(new TitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,null,null));
    centerPanel.setLayout(new GridLayout(4,8));
    getContentPane().add(centerPanel, BorderLayout.CENTER);
    //初始化图片
    String[][] exactnessOrder=order();
    //按排列添加按钮，设置图片
    for(int row=0;row<4;row++){
    	for(int col=0;col<4;col++){
    		final JButton button=new JButton();
    		button.setName(row+""+col);
    		button.setIcon(new ImageIcon(exactnessOrder[row][col]));
    		if(exactnessOrder[row][col].equals("image/"+num+"00.jpg"))
    			emptyButton=button;
    		button.addActionListener(new ImgButtonAction());
    		centerPanel.add(button);
    	}
    }
}
//初始化图片
private String[][] order(){
	String[][] exactnessOrder =new String[4][4];
	for (int row=0; row<4; row++) {
		for (int col=0; col<4; col++) {
			exactnessOrder[row][col] = "image/"+ num+ row+ col+ ".jpg"; 
		}
	}
	return exactnessOrder;
			}
//随机排列图片
private String[][] reorder(){
	String[][] exactnessOrder = new String[4][4];
	for (int row=0; row<4; row++) {
		for (int col=0; col<4; col++) {
			exactnessOrder[row][col] = "image/"+ num+ row+ col+ ".jpg"; 
		}
	}
	String[][] sOrder=new String[4][4];
	for(int row=0;row<4;row++){
		for(int col=0;col<4;col++){
			while(sOrder[row][col]==null){
				int r=(int) (Math.random()*4);
				int c=(int)(Math.random()*4);
				if(exactnessOrder[r][c]!=null){
					sOrder[row][col]=exactnessOrder[r][c];
					exactnessOrder[r][c]=null;
				}
			}
		}
	}
	return sOrder;
}


//游戏时排列图片
class ImgButtonAction implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String emptyName=emptyButton.getName();
		int emptyRow=(int)emptyName.charAt(0);
		int  emptyCol=(int)emptyName.charAt(1);
		JButton clickButton =(JButton)e.getSource();//EventObject.getSource()最初发生Event的对象
		String clickName=clickButton.getName();
		int clickRow=(int)clickName.charAt(0);
		int  clickCol=(int)clickName.charAt(1);
		if(Math.abs(clickRow-emptyRow)+Math.abs(clickCol-emptyCol)==1){//Math.abs(int a)返回int值的绝对值
			emptyButton.setIcon(clickButton.getIcon());
			clickButton.setIcon(new ImageIcon("image"+num+"00.jpg"));
			emptyButton=clickButton;
		}
	}
}
//换下一张图片
class NextButtonAction implements ActionListener{
	public void actionPerformed(ActionEvent e){
		if(num==3){
			num=0;
		}
		else{
			++num;
		}
		modelLabel.setIcon(new ImageIcon("image/"+num+"model.jpg"));
		String[][] exactnessOrder=order();
		int i=0;
		for(int row=0;row<4;row++){
			for(int col=0;col<4;col++){
				JButton button=(JButton)centerPanel.getComponent(i++);
				button.setIcon(new ImageIcon(exactnessOrder[row][col]));
				if(exactnessOrder[row][col].equals("image/"+num+"00.jpg"))
					emptyButton=button;
			}
		}
	}
}
//开局排列图片
class StartButtonAction implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String[][] sOrder=reorder();
		int i=0;
		for(int row=0;row<4;row++){
			for(int col=0;col<4;col++){
				JButton button=(JButton) centerPanel.getComponent(i++);//获取此容器中的第n个组件
				button.setIcon(new ImageIcon(sOrder[row][col]));
					
				if(sOrder[row][col].equals("image/"+num+"00.jpg"))
					
					
					
					emptyButton=button;
				
			}
		}
		
	}
}
}
