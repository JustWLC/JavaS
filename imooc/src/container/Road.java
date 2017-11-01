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
	ListIterator<String> li=cars.listIterator();//取得"警察"对象
	System.out.println("放行："+li.next());
	System.out.println("违章，靠边停车："+li.next());
	li.remove();
	String cc=li.next();
	System.out.println("让"+cc+"到前面去");
	li.remove();
	li.next();
	li.set(cc);
	System.out.println("\n现在道路畅通了");
	for(String a:cars){
		System.out.println(a);
	}
}
}
