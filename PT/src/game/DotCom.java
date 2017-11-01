package game;

import java.util.ArrayList;

public class DotCom {
private ArrayList<String> locationCells;  //DotCom实例变量：保存位置的ArrayList DotCom的名称
private String name;

public void setLocationCells(ArrayList<String> loc){   //更新DotCom位置的set方法
	locationCells=loc;
}
public void setName(String n){
	name=n;
}
public String checkYourself(String userInput){
	String result="miss";
	int index=locationCells.indexOf(userInput);
	if(index>=0){
		locationCells.remove(index);    //删除被猜中的位置
		
		if(locationCells.isEmpty()){
			result="kill";
			System.out.println("ouch!You sunk "+name+":(");
			
		}else{
			result="hit";
		}
	}
	return result;                      //返回状态
}
}
