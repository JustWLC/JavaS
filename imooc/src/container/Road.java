package container;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Road {
public static void main(String[] args){
	List<String> cars=new ArrayList<String>();
	cars.add("Fored");
	cars.add("Dodge");
	cars.add("Fujiv");
	cars.add("Bfgyh");
	cars.add("Mazdh");
	cars.add("Humer");
	ListIterator<String> li=cars.listIterator();//ȡ��"����"����
	System.out.println("���У�"+li.next());
	System.out.println("Υ�£�����ͣ����"+li.next());
	li.remove();
	String cc=li.next();
	System.out.println("��"+cc+"��ǰ��ȥ");
	li.remove();
	li.next();
	li.set(cc);
	System.out.println("\n���ڵ�·��ͨ��");
	for(String a:cars){
		System.out.println(a);
	}
}
}
