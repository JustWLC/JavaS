package WEB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
 public static void main(String[] args) {
	try{
		Server server=new Server(8080);            //����˿ں�ʵ��������
	}catch(Exception e){                           //�����쳣
		System.out.println("���Է������˼�������"+e.getMessage());
		
	}
}
}
class Server{                                      //Socket��������
	private int port;                              //�˿�
	public Server(int port){                       //�������Ĺ��췽�����г�ʼ��
		this.port=port;
		start();
	}
public String infoUpperCase(String line){          //������Ϣ
	return line.toUpperCase();                     //���ַ�����д
}
public void start(){                               //������������
		try{
			//���ݶ˿ڴ�����������Socket����
			ServerSocket serverSocket=new ServerSocket(port);
			//��ʾ������Ϣ
			System.out.println("�������������������˿ں�Ϊ��"+port);
			System.out.println("���ڵȴ��ͻ�������......");
			//����ȴ��ͻ�������
			Socket socketAccept=serverSocket.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));
			//��ȡд��ͻ��˵����������������true��ʾ�Զ�ˢ�����������
			PrintWriter out=new PrintWriter(socketAccept.getOutputStream(),true);
			out.println("�����������ӳɹ�");
			out.println("����quit�Ͽ��������������");
			boolean done=false;
			while(!done){
				String line=in.readLine();
				if(line==null){
					done=true;
				}else{
					//��ʾ�ͻ��˷��͵�����
					System.out.print("���Կͻ��˵���Ϣ��"+line);
					//��Ϣ����
					String message=infoUpperCase(line);
					//��ͻ��˷�����Ϣ
					out.println("���Է������˵���Ϣ"+message);
					if(line.trim().equals("quit"))    //�˳��ж�
						done=true;
				}
			}
			socketAccept.close();
		}catch(Exception e){
			System.out.println("�����������˳��ִ���"+e.getMessage());;
		}
	}
}
