package SP;

import java.util.ArrayList;

public class DotCom {
private ArrayList<String> locationCells;
private String name;

public void setLocationCells(ArrayList<String> loc){     //����DotComλ�÷���
	locationCells=loc;
}
public void setName(String n){
	name=n;
}
public String checkYourself(String userInput){
	String result="miss";
	int index=locationCells.indexOf(userInput);//ʹ�õ�index�����������Ҳ���λ�õĻ�����������᷵������λ�á����û�еĻ��᷵��
	if(index>=0){
		locationCells.remove(index);
	
	if(locationCells.isEmpty()){     //������������ж��Ƿ񱻻���
		result="kill";
		System.out.println("Ouch!You sunk"+name+" :(");
	}else{
		result="hit";
		}
}
return result;

}
}
