package container;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperMarket {
public static void main(String []args){
	List<String> storage=new ArrayList<String>();
	storage.add("foods");
	storage.add("books");
	storage.add("tools");
	storage.add("cars");
	List<String> clothing=new ArrayList<String>();
	clothing.add("address");
	clothing.add("costume");
	storage.addAll(clothing);
    System.out.println("���е���Ʒ��");
    for(String p:storage){
    	System.out.println(p);
    }
    System.out.println("\n������Ʒ�ṹ:");
    storage.remove("cars");
    Iterator<String> it=storage.iterator();
    while(it.hasNext()){
    	String s=it.next();
    	System.out.println(s);
    }
}
}
