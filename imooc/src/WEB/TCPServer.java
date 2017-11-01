package WEB;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
 public static void main(String[] args) {
	try{
		Server server=new Server(8080);            //传入端口号实例化对象
	}catch(Exception e){                           //捕获异常
		System.out.println("测试服务器端监听出错："+e.getMessage());
		
	}
}
}
class Server{                                      //Socket服务器端
	private int port;                              //端口
	public Server(int port){                       //带参数的构造方法进行初始化
		this.port=port;
		start();
	}
public String infoUpperCase(String line){          //处理信息
	return line.toUpperCase();                     //将字符串大写
}
public void start(){                               //启动服务器端
		try{
			//根据端口创建服务器端Socket对象
			ServerSocket serverSocket=new ServerSocket(port);
			//显示连接信息
			System.out.println("服务器已启动，监听端口号为："+port);
			System.out.println("正在等待客户端连接......");
			//挂起等待客户的请求
			Socket socketAccept=serverSocket.accept();
			BufferedReader in=new BufferedReader(new InputStreamReader(socketAccept.getInputStream()));
			//获取写入客户端的数据输出流，参数true表示自动刷新输出缓冲区
			PrintWriter out=new PrintWriter(socketAccept.getOutputStream(),true);
			out.println("服务器端连接成功");
			out.println("输入quit断开与服务器的连接");
			boolean done=false;
			while(!done){
				String line=in.readLine();
				if(line==null){
					done=true;
				}else{
					//显示客户端发送的请求
					System.out.print("来自客户端的信息："+line);
					//信息处理
					String message=infoUpperCase(line);
					//向客户端发送消息
					out.println("来自服务器端的信息"+message);
					if(line.trim().equals("quit"))    //退出判断
						done=true;
				}
			}
			socketAccept.close();
		}catch(Exception e){
			System.out.println("启动服务器端出现错误："+e.getMessage());;
		}
	}
}
