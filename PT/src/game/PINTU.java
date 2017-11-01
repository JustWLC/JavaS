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
//�������ڹ��췽��
public PINTU(){
	super();
	setResizable(true);//���ô˴����Ƿ�����û�������С
	setTitle("ƴͼ��Ϸ");
	setBounds(570,400,380,525);  //�ƶ�������������С
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�����û��ڴ˴����Ϸ���close��ʱĬ��ִ�еĲ���
	  
	//����������,�����ӱ߿򲼾�
	final JPanel topPanel=new JPanel();
	topPanel.setBorder(new TitledBorder(null,"Welcome Use",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,null,Color.BLUE));
	/*TitledBorder(Border border,String title,int titleJustification,int titlePosition,Font titleFont,Color titlecolor)
	 ��ָ���ı߿򡢱��⡢������뷽ʽ������λ�á���������ͱ�����ɫ����TitledBorderʵ��*/
	topPanel.setLayout(new BorderLayout());
	getContentPane().add(topPanel,BorderLayout.NORTH);
	//������ǩ��ԭͼ
	modelLabel =new JLabel();
	modelLabel.setIcon(new ImageIcon("image/"+num+"model.jpg"));
	//JLabel.setIcon(Icon icon)����������Ҫ��ʾ��ͼ��
	//ImageIcon() ����һ��δ��ʼ����ͼ��ͼ��
	//swing.ImageIcon.ImageIcon(String filename) ����ָ�����ļ�����һ��ImageIcon
	topPanel.add(modelLabel, BorderLayout.WEST);
	//���Ҳ�Ӹ���壬���������ť
	JPanel eastPanel=new JPanel();
	topPanel.add(eastPanel, BorderLayout.CENTER);
	eastPanel.setLayout(new BorderLayout());
	JButton nextButton=new JButton();
	nextButton.setText("��һ��");
	
	nextButton.addActionListener(new NextButtonAction());
	eastPanel.add(nextButton,BorderLayout.NORTH);
	//������ť������Ӽ���
	final JButton startButton=new JButton();
	startButton.setText("��ʼ");
	startButton.addActionListener(new StartButtonAction());
	eastPanel.add(startButton, BorderLayout.CENTER);
	//��ʼ��������壬���ñ߿���Ӱ�ť
	centerPanel=new JPanel();
	centerPanel.setBorder(new TitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,null,null));
    centerPanel.setLayout(new GridLayout(4,8));
    getContentPane().add(centerPanel, BorderLayout.CENTER);
    //��ʼ��ͼƬ
    String[][] exactnessOrder=order();
    //��������Ӱ�ť������ͼƬ
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
//��ʼ��ͼƬ
private String[][] order(){
	String[][] exactnessOrder =new String[4][4];
	for (int row=0; row<4; row++) {
		for (int col=0; col<4; col++) {
			exactnessOrder[row][col] = "image/"+ num+ row+ col+ ".jpg"; 
		}
	}
	return exactnessOrder;
			}
//�������ͼƬ
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


//��Ϸʱ����ͼƬ
class ImgButtonAction implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String emptyName=emptyButton.getName();
		int emptyRow=(int)emptyName.charAt(0);
		int  emptyCol=(int)emptyName.charAt(1);
		JButton clickButton =(JButton)e.getSource();//EventObject.getSource()�������Event�Ķ���
		String clickName=clickButton.getName();
		int clickRow=(int)clickName.charAt(0);
		int  clickCol=(int)clickName.charAt(1);
		if(Math.abs(clickRow-emptyRow)+Math.abs(clickCol-emptyCol)==1){//Math.abs(int a)����intֵ�ľ���ֵ
			emptyButton.setIcon(clickButton.getIcon());
			clickButton.setIcon(new ImageIcon("image"+num+"00.jpg"));
			emptyButton=clickButton;
		}
	}
}
//����һ��ͼƬ
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
//��������ͼƬ
class StartButtonAction implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String[][] sOrder=reorder();
		int i=0;
		for(int row=0;row<4;row++){
			for(int col=0;col<4;col++){
				JButton button=(JButton) centerPanel.getComponent(i++);//��ȡ�������еĵ�n�����
				button.setIcon(new ImageIcon(sOrder[row][col]));
					
				if(sOrder[row][col].equals("image/"+num+"00.jpg"))
					
					
					
					emptyButton=button;
				
			}
		}
		
	}
}
}
