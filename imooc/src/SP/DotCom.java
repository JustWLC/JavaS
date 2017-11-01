package SP;

import java.util.ArrayList;

public class DotCom {
private ArrayList<String> locationCells;
private String name;

public void setLocationCells(ArrayList<String> loc){     //更新DotCom位置方法
	locationCells=loc;
}
public void setName(String n){
	name=n;
}
public String checkYourself(String userInput){
	String result="miss";
	int index=locationCells.indexOf(userInput);//使用到index方法，如果玩家猜中位置的话，这个方法会返回它的位置。如果没有的话会返回
	if(index>=0){
		locationCells.remove(index);
	
	if(locationCells.isEmpty()){     //用这个方法来判断是否被击沉
		result="kill";
		System.out.println("Ouch!You sunk"+name+" :(");
	}else{
		result="hit";
		}
}
return result;

}
}
