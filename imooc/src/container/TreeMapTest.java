package container;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args){
	Map<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("张三", new Integer(5));
	hm.put("李四", new Integer(3));
	hm.put("王二", new Integer(1));
	hm.put("赵刚", new Integer(4));
	System.out.println(hm);
	//创建一个TreeMap对象
	Map<String,Integer> sortedMap=new TreeMap<String,Integer>();
	sortedMap.putAll(hm);
	System.out.println(sortedMap);
	Iterator itk=hm.keySet().iterator();//返回hm的键的迭代器
	Iterator itv=hm.values().iterator();//返回hm的值的迭代器
	while(itk.hasNext()){
		Object key=itk.next();
		Object value=itv.next();
		System.out.print(key.toString()+"=");
		System.out.print(value.toString()+",");
	}
}
public static void print(Collection c){
	Iterator it=c.iterator();
	while(it.hasNext()){
		Object o=it.next();
		System.out.println(o);
	}
	
}
}
